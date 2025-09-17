public class App {
    public static void main(String[] args) throws Exception {
        // TODO: Crear una instancia de la vista y del controlador,
        // enlazarlos y hacer visible la vista para iniciar la aplicación.
        VistaConversor vista = new VistaConversor();
        ControladorConversor controlador = new ControladorConversor(vista);
        vista.mostrar();
    }
}
