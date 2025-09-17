import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.net.URL;

public class VistaLaboratorio extends JFrame {

    private JPasswordField campoPassword;
    private JButton botonConfirmar;
    private JLabel labelFeedback;
    private JLabel labelIconoAyuda;
    private JLabel labelGifAyuda;

public VistaLaboratorio() {
    setTitle("Laboratorio Interactivo de Eventos");
    setSize(500, 450);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout(10, 10));
    getContentPane().setBackground(new Color(240, 240, 240));

    JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
    panelSuperior.setOpaque(false); 

    campoPassword = new JPasswordField(15);
    campoPassword.setToolTipText("La contraseña debe tener al menos 8 caracteres");

    ImageIcon iconoAyudaImg = cargarImagen("/recursos/ayuda.png", 32, 32);
    labelIconoAyuda = new JLabel(iconoAyudaImg);
    labelIconoAyuda.setToolTipText("Pasa el mouse aquí para obtener una pista");
    
    botonConfirmar = new JButton("Confirmar");

    panelSuperior.add(new JLabel("Contraseña:"));
    panelSuperior.add(campoPassword);
    panelSuperior.add(labelIconoAyuda);
    panelSuperior.add(botonConfirmar);


    labelFeedback = new JLabel("Esperando contraseña...", SwingConstants.CENTER);
    labelFeedback.setPreferredSize(new Dimension(400, 30));
    labelFeedback.setOpaque(true);
    labelFeedback.setBackground(Color.LIGHT_GRAY);


    URL gifUrl = getClass().getResource("/recursos/pista.gif");
    ImageIcon gifAyudaImg = new ImageIcon(gifUrl);
    labelGifAyuda = new JLabel(gifAyudaImg);
    labelGifAyuda.setVisible(false);
    labelGifAyuda.setHorizontalAlignment(SwingConstants.CENTER);


    add(panelSuperior, BorderLayout.NORTH);
    add(labelGifAyuda, BorderLayout.CENTER);
    add(labelFeedback, BorderLayout.SOUTH); 
}


    public String getPassword() {
        return new String(campoPassword.getPassword());
    }

    public void mostrarFeedbackValidacion(boolean esValido) {
        if (esValido) {
            labelFeedback.setText("¡Contraseña Válida!");
            labelFeedback.setBackground(new Color(144, 238, 144)); // Verde claro
        } else {
            labelFeedback.setText("La contraseña debe tener 8 o más caracteres");
            labelFeedback.setBackground(new Color(255, 182, 193)); // Rojo claro
        }
    }

    public void mostrarImagenAyuda(boolean mostrar) {
        labelGifAyuda.setVisible(mostrar);
        this.revalidate();
        this.repaint();
    }

    public void reproducirSonido(String nombreArchivo) {
        try {
            InputStream audioSrc = getClass().getResourceAsStream("/recursos/" + nombreArchivo);
            InputStream bufferedIn = new java.io.BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPasswordListener(KeyListener listener) {
        this.campoPassword.addKeyListener(listener);
    }

    public void addConfirmarListener(ActionListener listener) {
        this.botonConfirmar.addActionListener(listener);
    }

    public void addAyudaListener(MouseListener listener) {
        this.labelIconoAyuda.addMouseListener(listener);
    }
    
    private ImageIcon cargarImagen(String path, int width, int height) {
        URL url = getClass().getResource(path);
        if (url != null) {
            ImageIcon originalIcon = new ImageIcon(url);
            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(resizedImage);
        } else {
            System.err.println("No se pudo encontrar el recurso: " + path);
            return new ImageIcon(new byte[0]);
        }
    }
}