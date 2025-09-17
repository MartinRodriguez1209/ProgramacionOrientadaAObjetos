import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorConversor implements ActionListener {

    private VistaConversor vista;
    private static final double TASA_CAMBIO_USD = 1388.0; // Tasa de cambio fija

    public ControladorConversor(VistaConversor vista) {
        this.vista = vista;
        // TODO: Registrar este controlador como ActionListener del botón de la vista.
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Obtener el texto del campo de pesos de la vista.
        String textoPesos = ""; 
        
        try {
            // TODO: Convertir el texto a un número de tipo double.
            double montoEnPesos = 0.0;
            
            // TODO: Calcular el monto equivalente en dólares.
            double montoEnDolares = 0.0;

            // TODO: Actualizar el texto de la etiqueta de resultado en la vista,
            // mostrando el monto en dólares con dos decimales.
            // Pista: Se puede usar String.format("Resultado: %.2f USD", montoEnDolares)
            
        } catch (NumberFormatException ex) {
            // Manejo de error si el usuario no ingresa un número válido.
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
        }
    }
}