public class PublicacionRevista extends PublicacionRefactorizada {

    private String descripcion;

    public PublicacionRevista(String tipo, String titulo, String autor, int anio, String descripcion) {
        super(tipo, titulo, autor, anio);
        this.descripcion = descripcion;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Descripcion: " + this.descripcion);
    }
}
