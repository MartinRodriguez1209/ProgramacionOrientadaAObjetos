import java.util.ArrayList;
import java.util.List;

public class KitProductos implements ComponenteCarrito {
    private List<ComponenteCarrito> items = new ArrayList<>();
    private String nombre;

    // TODO: Implementar constructor y métodos para agregar/remover items.
    public KitProductos(String nombre) {
        this.nombre = nombre;
    }

    public void agregarItem(Producto producto) {
        items.add(producto);
    }

    // TODO: Sobrescribir obtenerPrecio() para que sume el precio de sus hijos.
    // TODO: Sobrescribir getDescripcion() para que liste los nombres de sus hijos.
    @Override
    public double obtenerPrecio() {
        Double precio = 0.0;
        for (ComponenteCarrito componenteCarrito : items) {
            precio = precio + componenteCarrito.obtenerPrecio();
        }
        return precio;
    }

    @Override
    public String getDescripcion() {
        String descripcion = "";
        for (ComponenteCarrito componenteCarrito : items) {
            descripcion = " :" + componenteCarrito.getDescripcion() + " ";
        }
        return descripcion;
    }
}