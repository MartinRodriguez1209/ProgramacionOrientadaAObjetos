package modelo;

public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    private String carrera;

    public Alumno(int legajo, String nombre, String apellido, String carrera) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    // Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + ", Nombre: " + nombre + " " + apellido + ", Carrera: " + carrera;
    }
}
