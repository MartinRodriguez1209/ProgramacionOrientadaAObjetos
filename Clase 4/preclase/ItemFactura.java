// Clase que representa un item individual dentro de una factura.
public class ItemFactura {
    private String producto;
    private double precioUnitario;

    public ItemFactura(String producto, double precioUnitario) {
        this.producto = producto;
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    @Override
    public String toString() {
        return "Item: " + producto + ", Precio: $" + precioUnitario;
    }
}
