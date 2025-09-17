public class Producto implements ComponenteCarrito {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // TODO: Implementar constructor y los métodos de la interfaz.
    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String getDescripcion() {
        return nombre;
    }
}