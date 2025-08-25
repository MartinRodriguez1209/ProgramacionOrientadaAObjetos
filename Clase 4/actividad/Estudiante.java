
public class Estudiante {

    private static int proximoLegajo = 10001;

    private int legajo;
    private String nombre;
    private String apellido;

    public Estudiante(String nombre, String apellido) {
        // ... COMPLETAR ACÁ ...
        this.legajo = proximoLegajo++;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return this.legajo;
    }

    @Override
    public String toString() {
        return "Estudiante [Legajo: " + legajo + ", Nombre: " + apellido + ", " + nombre + "]";
    }
}
