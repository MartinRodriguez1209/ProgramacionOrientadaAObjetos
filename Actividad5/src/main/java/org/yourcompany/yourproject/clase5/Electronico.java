package clase5;

// TODO: Hacer que esta clase HEREDE de Producto
public class Electronico extends Producto {

    private String fabricante;
    private int mesesGarantia;

    // TODO: Implementar el constructor de Electronico.
    // Similar al de Libro, debe invocar al constructor de Producto.
    // public Electronico(...) { ... }
    public Electronico(String codigo, String nombre, double precio, String fabricante, int mesesGarantias) {
        super(codigo, nombre, precio);
        this.fabricante = fabricante;
        this.mesesGarantia = mesesGarantias;
    }
    // TODO: Sobrescribir el método mostrarDetalle() para incluir el fabricante y la garantía.
    // Reutilizar la implementación de la superclase es fundamental.
    // @Override
    // public void mostrarDetalle() { ... }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Meses de garantia: " + this.mesesGarantia);
    }

}
