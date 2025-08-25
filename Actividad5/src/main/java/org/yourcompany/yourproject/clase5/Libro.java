package clase5;

// TODO: Hacer que esta clase HEREDE de Producto
public class Libro extends Producto {

    private String autor;
    private String isbn;

    // TODO: Implementar el constructor de Libro.
    // Debe recibir todos los datos necesarios (incluidos los de Producto).
    // La primera línea DEBE ser una llamada al constructor de la superclase.
    // public Libro(...) {
    //     super(...);
    //     ...
    // }
    public Libro(String codigo, String nombre, double precio, String autor, String isbn) {
        super(codigo, nombre, precio);
        this.autor = autor;
        this.isbn = isbn;
    }

    // TODO: Sobrescribir el método mostrarDetalle() para incluir el autor y el ISBN.
    // La implementación debe REUTILIZAR el método mostrarDetalle() de la clase padre.
    // @Override
    // public void mostrarDetalle() {
    //     ... // Llamar al método del padre
    //     ... // Imprimir los detalles propios de Libro
    // }
    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
    }

}
