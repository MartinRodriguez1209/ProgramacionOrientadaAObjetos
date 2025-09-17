package modelo;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class AlumnoModel extends AbstractTableModel {
    private List<Alumno> alumnos = new ArrayList<>();
    private final String[] columnNames = { "Legajo", "Nombre", "Apellido", "Carrera" };

    public AlumnoModel() {
        // Datos de ejemplo
        alumnos.add(new Alumno(101, "Juan", "Perez", "Ing. en Electrónica"));
        alumnos.add(new Alumno(102, "Ana", "Gomez", "Lic. en Informática"));
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        fireTableRowsInserted(alumnos.size() - 1, alumnos.size() - 1);
    }

    public void modificarAlumno(int rowIndex, Alumno alumno) {
        alumnos.set(rowIndex, alumno);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public void eliminarAlumno(int rowIndex) {
        alumnos.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Alumno getAlumno(int rowIndex) {
        return alumnos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO: 1. Obtener el alumno de la lista para la fila dada (rowIndex).
        // TODO: 2. Usar un switch (o if-else) sobre la columna (columnIndex) para
        Alumno al = alumnos.get(rowIndex);
        // devolver
        // el atributo correspondiente del alumno.
        // Ejemplo: para la columna 0, devolver el legajo; para la 1, el nombre, etc.
        switch (columnIndex) {
            case 0:
                return al.getLegajo();
            case 1:
                return al.getNombre();
            case 2:
                return al.getApellido();
            case 3:
                return al.getCarrera();

            default:
                break;
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
