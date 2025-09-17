import javax.swing.SwingUtilities;

import modelo.AlumnoModel;
import controlador.AlumnoController;
import vista.AlumnoView;

public class App {
    public static void main(String[] args) {
        // Asegura que la GUI se cree en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> {
            // Crear el modelo, la vista y el controlador
            AlumnoModel model = new AlumnoModel();
            AlumnoView view = new AlumnoView();
            new AlumnoController(model, view);

            // Hacer visible la vista
            view.setVisible(true);
        });
    }
}