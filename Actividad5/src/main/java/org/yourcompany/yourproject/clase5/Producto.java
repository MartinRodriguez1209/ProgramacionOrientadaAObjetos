package clase5;

public class Producto {

    protected String codigo;
    protected String nombre;
    protected double precio;

    // TODO: Crear un constructor que inicialice estos tres atributos
    // public Producto(...) { ... }
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    // Método para mostrar la información básica del producto
    public void mostrarDetalle() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
    }
}
