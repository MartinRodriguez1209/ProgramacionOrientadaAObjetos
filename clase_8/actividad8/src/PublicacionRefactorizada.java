public abstract class PublicacionRefactorizada {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public PublicacionRefactorizada(String tipo, String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anio;
    }

    public void imprimirDetalles() {
        System.out.println("Título: " + titulo + " (" + anioPublicacion + ")");
        System.out.println("Autor: " + autor);
    }

    public String getTitulo() {
        return titulo;
    }

}
