
// Dentro de la clase ControladorLaboratorio.java
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLaboratorio {
    private VistaLaboratorio vista;

    public ControladorLaboratorio(VistaLaboratorio vista) {
        this.vista = vista;
        this.registrarListeners();
    }

    private void registrarListeners() {
        // 1. TAREA: Añadir acá el KeyListener para el campo de contraseña.
        // Utilice un KeyAdapter y llame a vista.mostrarFeedbackValidacion(...)
        // según la longitud de la contraseña.
        // vista.addPasswordListener(...);

        vista.addPasswordListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                vista.mostrarFeedbackValidacion(vista.getPassword().length() >= 8);
            }
        });

        // 2. TAREA: Añadir acá el ActionListener para el botón.
        // Utilice una expresión lambda. Dentro, compruebe la validez
        // y llame a vista.reproducirSonido(...) con el archivo correcto.
        // vista.addConfirmarListener(...);

        vista.addConfirmarListener(
                e -> {
                    if (vista.getPassword().length() >= 8) {
                        vista.reproducirSonido("confirmar.wav");
                    } else {
                        vista.reproducirSonido("error.wav");
                    }
                });

        // 3. TAREA: Añadir acá el MouseListener para el ícono de ayuda.
        // Utilice un MouseAdapter para sobrescribir mouseEntered y mouseExited.
        // Llame a vista.mostrarImagenAyuda(...) con true o false.
        // vista.addAyudaListener(...);

        vista.addAyudaListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                vista.mostrarImagenAyuda(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                vista.mostrarImagenAyuda(false);
            }
        });

    }
}
