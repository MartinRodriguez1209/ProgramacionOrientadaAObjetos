
import java.util.ArrayList;
import java.util.Date;

public class Ticket {

    private Integer numeroVenta;
    private Date fecha;
    private ArrayList<Articulo> articulos;
    private Double total;

    public Ticket(Date fecha, Integer numeroVenta) {
        this.fecha = fecha;
        this.numeroVenta = numeroVenta;
        this.articulos = new ArrayList<Articulo>();
    }

    public void agregarArticulo(Articulo articulo) {
        calcularPrecio(articulo);
        this.articulos.add(articulo);

    }

    private void calcularPrecio(Articulo articulo) {
        this.total = this.total + articulo.getPrecio();

        for (Articulo elemento : articulos) {
            this.total = elemento.getPrecio();
        }
    }
}
