public class PublicacionLibro extends PublicacionRefactorizada {

    private int paginas;

    public PublicacionLibro(String tipo, String titulo, String autor, int anio, int paginas) {
        super(tipo, titulo, autor, anio);
        this.paginas = paginas;
    }

    @Override
    public void imprimirDetalles() {

        super.imprimirDetalles();
        System.out.println("Páginas: " + paginas);
    }

}