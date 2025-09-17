package vista;

import javax.swing.*;

import modelo.AlumnoModel;

import java.awt.*;

public class AlumnoView extends JFrame {
    private JTable tablaAlumnos;
    private JButton btnVer, btnNuevo, btnModificar, btnEliminar;

    public AlumnoView() {
        setTitle("Gestión de Alumnos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // --- TAREA DE LAYOUT Y JTABLE ---

        // TODO 1: Inicializar el panelPrincipal con un layout manager adecuado.
        // Se recomienda usar BorderLayout: new JPanel(new BorderLayout(10, 10));
        JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // TODO 2: Inicializar la JTable 'tablaAlumnos'.
        // El controlador se encargará después de asignarle el modelo correcto.
        AlumnoModel misAlumnos = new AlumnoModel();
        tablaAlumnos = new JTable(misAlumnos);

        // TODO 3: Crear un JScrollPane que contenga la tabla para que tenga barras de
        // desplazamiento.
        // Ejemplo: JScrollPane scrollPane = new JScrollPane(tablaAlumnos);
        JScrollPane scrollPane = new JScrollPane(tablaAlumnos);

        // TODO 4: Añadir el JScrollPane al panelPrincipal.
        // Si usaste BorderLayout, debería ir en la posición central.
        // Ejemplo: panelPrincipal.add(scrollPane, BorderLayout.CENTER);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);

        // El panel de botones ya está creado y configurado, no necesitas modificarlo.
        JPanel panelBotones = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 5, 5);
        btnVer = new JButton("Ver Datos");
        btnNuevo = new JButton("Nuevo Alumno");
        btnModificar = new JButton("Modificar Alumno");
        btnEliminar = new JButton("Eliminar Alumno");
        panelBotones.add(btnVer, gbc);
        panelBotones.add(btnNuevo, gbc);
        panelBotones.add(btnModificar, gbc);
        panelBotones.add(btnEliminar, gbc);
        gbc.weighty = 1.0;
        panelBotones.add(new JLabel(), gbc);

        // TODO 5: Añadir el panelBotones al panelPrincipal.
        // Si usaste BorderLayout, debería ir en la posición este.
        // Ejemplo: panelPrincipal.add(panelBotones, BorderLayout.EAST);

        panelPrincipal.add(panelBotones, BorderLayout.EAST);

        // Las siguientes líneas añaden los componentes sin un layout manager funcional
        // para que puedas ver el problema que debes resolver.
        // Deberás eliminar o comentar estas líneas cuando implementes los TODOs de
        // arriba.
        // panelPrincipal.add(new JScrollPane(tablaAlumnos));
        // panelPrincipal.add(panelBotones);

        add(panelPrincipal);
    }

    // Getters para que el controlador acceda a los componentes
    public JTable getTablaAlumnos() {
        return tablaAlumnos;
    }

    public JButton getBtnVer() {
        return btnVer;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }
}
