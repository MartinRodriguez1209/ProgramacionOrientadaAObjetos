public class Publicacion {

    private String tipo; // "Libro", "Revista", etc.
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int paginas; // Solo para libros Principio Liskov

    public Publicacion(String tipo, String titulo, String autor, int anio, int paginas) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anio;
        this.paginas = paginas;
    }

    /**
     * Calcula el costo de la multa por días de retraso.
     * La lógica varía según el tipo de publicación. Principio responsabilidad unica
     * y principio Abierto cerrado
     */
    public double calcularMulta(int diasDeRetraso) {
        double multa = 0.0;
        if (tipo.equals("Libro")) {
            // Los libros tienen una multa base de $500 por día.
            multa = diasDeRetraso * 500.0;
        } else if (tipo.equals("Revista")) {
            // Las revistas no se prestan, no hay multa.
            multa = 0.0;
        }
        // Futuros tipos de publicación requerirían más 'else if'...
        return multa;
    }

    /**
     * Imprime los detalles de la publicación en la consola.
     * El formato varía ligeramente.
     */
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo + " (" + anioPublicacion + ")");
        System.out.println("Autor: " + autor);
        if (tipo.equals("Libro")) {
            System.out.println("Páginas: " + paginas);
        }
    }

    /**
     * Guarda la publicación en la base de datos (simulado).
     * Actualmente, solo imprime en consola. Principio responsabilidad unica
     */
    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando en BBDD: " + titulo);
        // Lógica de conexión a la BBDD, SQL, etc.
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public String getTitulo() {
        return titulo;
    }
    // ... otros getters y setters
}
