import javax.swing.*;

public class VistaConversor {

    private JFrame ventana;
    private JTextField campoPesos;
    private JLabel etiquetaResultado;
    private JButton botonConvertir;

    public VistaConversor() {
        // --- Configuración de la Ventana ---
        ventana = new JFrame("Conversor de Moneda");
        ventana.setSize(350, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        // --- Creación de Componentes ---
        JLabel etiquetaPesos = new JLabel("Monto en Pesos (ARS):");
        campoPesos = new JTextField();
        botonConvertir = new JButton("Convertir a USD");
        etiquetaResultado = new JLabel("Resultado: ...");

        // --- Posicionamiento de Componentes ---
        // TODO: Utilizar el método setBounds() para posicionar cada componente
        // en una ubicación lógica dentro de la ventana.
        // Ejemplo: etiquetaPesos.setBounds(20, 30, 150, 25);
        etiquetaPesos.setBounds(20, 30, 150, 25);
        campoPesos.setBounds(172, 30, 80, 25);
        botonConvertir.setBounds(170, 60, 150, 25);
        etiquetaResultado.setBounds(20, 80, 150, 25);

        // --- Adición de Componentes a la Ventana ---
        // TODO: Utilizar el método add() de la ventana para añadir cada uno
        // de los cuatro componentes creados.
        this.ventana.add(etiquetaPesos);
        this.ventana.add(campoPesos);
        this.ventana.add(botonConvertir);
        this.ventana.add(etiquetaResultado);

    }

    // --- Métodos para el Controlador ---
    public void mostrar() {
        ventana.setVisible(true);
    }

    // TODO: Crear los métodos 'get' necesarios para que el Controlador
    // pueda acceder al botón, al campo de texto de pesos y a la etiqueta del
    // resultado.

    public JTextField getCampoPesos() {
        return campoPesos;
    }

    public JLabel getEtiquetaResultado() {
        return etiquetaResultado;
    }

    public JButton getBotonConvertir() {
        return botonConvertir;
    }

}