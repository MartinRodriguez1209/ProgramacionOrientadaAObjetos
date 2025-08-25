
public class Articulo {

    private String nombre;
    private String dosis;
    private double precio;

    public Articulo(String dosis, String nombre, double precio) {
        this.dosis = dosis;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public double getPrecio() {
        System.out.printf("Total= %i", 10);
        return precio;
    }

}
