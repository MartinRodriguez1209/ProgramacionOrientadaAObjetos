package controlador;

import modelo.Alumno;
import modelo.AlumnoModel;
import vista.AlumnoView;
import vista.AlumnoFormView;

import javax.swing.*;

public class AlumnoController {
    private AlumnoModel model;
    private AlumnoView view;

    public AlumnoController(AlumnoModel model, AlumnoView view) {
        this.model = model;
        this.view = view;

        // Asignar el modelo a la tabla
        this.view.getTablaAlumnos().setModel(model);

        // Añadir listeners a los botones
        this.view.getBtnNuevo().addActionListener(e -> crearAlumno());
        this.view.getBtnModificar().addActionListener(e -> modificarAlumno());
        this.view.getBtnEliminar().addActionListener(e -> eliminarAlumno());
        this.view.getBtnVer().addActionListener(e -> verAlumno());
    }

    private void crearAlumno() {
        AlumnoFormView form = new AlumnoFormView(view, "Nuevo Alumno", true);
        Alumno nuevoAlumno = form.showDialog();
        
        if (nuevoAlumno != null) {
            model.agregarAlumno(nuevoAlumno);
        }
    }

    private void modificarAlumno() {
        int selectedRow = view.getTablaAlumnos().getSelectedRow();
        if (selectedRow >= 0) {
            Alumno alumnoSeleccionado = model.getAlumno(selectedRow);
            
            AlumnoFormView form = new AlumnoFormView(view, "Modificar Alumno", true, alumnoSeleccionado);
            Alumno alumnoModificado = form.showDialog();

            if (alumnoModificado != null) {
                model.modificarAlumno(selectedRow, alumnoModificado);
            }
        } else {
            JOptionPane.showMessageDialog(view, "Seleccione un alumno para modificar.");
        }
    }

    private void eliminarAlumno() {
        int selectedRow = view.getTablaAlumnos().getSelectedRow();
        if (selectedRow >= 0) {
            int option = JOptionPane.showConfirmDialog(view, "¿Está seguro de que desea eliminar este alumno?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                model.eliminarAlumno(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(view, "Seleccione un alumno para eliminar.");
        }
    }

    private void verAlumno() {
        int selectedRow = view.getTablaAlumnos().getSelectedRow();
        if (selectedRow >= 0) {
            Alumno alumno = model.getAlumno(selectedRow);
            JOptionPane.showMessageDialog(view, alumno.toString(), "Datos del Alumno", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Seleccione un alumno para ver sus datos.");
        }
    }
}
