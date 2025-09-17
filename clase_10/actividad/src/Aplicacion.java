import javax.swing.SwingUtilities;

public class Aplicacion {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VistaLaboratorio vista = new VistaLaboratorio();
            new ControladorLaboratorio(vista);
            vista.setVisible(true);
        });
    }
}