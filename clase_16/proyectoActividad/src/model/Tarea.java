package model;

public class Tarea {
    private int id;
    private String descripcion;
    private boolean completada;

    // Constructor por defecto
    public Tarea() {
    }

    // Constructor para crear una nueva tarea (el ID es autogenerado por la BD)
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, una nueva tarea no está completada
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Método toString() para imprimir el objeto de forma legible
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + completada +
                '}';
    }
}