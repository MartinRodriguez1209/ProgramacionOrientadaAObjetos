package vista;

import modelo.Alumno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AlumnoFormView extends JDialog {

    private JTextField legajoField = new JTextField(10);
    private JTextField nombreField = new JTextField(20);
    private JTextField apellidoField = new JTextField(20);
    private JTextField carreraField = new JTextField(20);

    private JButton btnGuardar = new JButton("Guardar");
    private JButton btnCancelar = new JButton("Cancelar");

    private Alumno alumnoResult = null;

    public AlumnoFormView(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        initComponents();
    }

    public AlumnoFormView(Frame owner, String title, boolean modal, Alumno alumno) {
        this(owner, title, modal);
        if (alumno != null) {
            legajoField.setText(String.valueOf(alumno.getLegajo()));
            nombreField.setText(alumno.getNombre());
            apellidoField.setText(alumno.getApellido());
            carreraField.setText(alumno.getCarrera());
        }
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        // --- TAREA DE LAYOUT ---
        // TODO: El panel 'formPanel' actualmente no tiene un layout manager, resultando
        // en que los
        // componentes se muestren desordenados.
        // Tu tarea es usar un layout manager (se recomienda GridBagLayout o GridLayout)
        // para organizar las etiquetas (JLabel) y los campos de texto (JTextField)
        // en una grilla clara y ordenada.
        JPanel formPanel = new JPanel(new GridLayout(10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        formPanel.add(new JLabel("Legajo:"));
        formPanel.add(legajoField);
        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(nombreField);
        formPanel.add(new JLabel("Apellido:"));
        formPanel.add(apellidoField);
        formPanel.add(new JLabel("Carrera:"));
        formPanel.add(carreraField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(btnGuardar);
        buttonPanel.add(btnCancelar);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnGuardar.addActionListener(this::onGuardar);
        btnCancelar.addActionListener(e -> dispose());

        pack();
        setLocationRelativeTo(getOwner());
    }

    private void onGuardar(ActionEvent e) {
        try {
            int legajo = Integer.parseInt(legajoField.getText());
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            String carrera = carreraField.getText();

            if (nombre.trim().isEmpty() || apellido.trim().isEmpty() || carrera.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error de Validación",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            this.alumnoResult = new Alumno(legajo, nombre, apellido, carrera);
            dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El legajo debe ser un número.", "Error de Formato",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public Alumno showDialog() {
        setVisible(true);
        return alumnoResult;
    }

}
