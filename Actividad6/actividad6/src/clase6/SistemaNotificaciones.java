package clase6;

import java.util.HashSet;
import java.util.Set;

public class SistemaNotificaciones {

    // TODO 6: Declare un atributo de tipo Set para almacenar los servicios.
    // Utilice la interfaz INotificable como tipo genérico del Set.
    private Set<INotificable> listaNoti;

    public SistemaNotificaciones() {
        // TODO 7: En el constructor, inicialice el Set de servicios
        // usando una implementación concreta como HashSet.
        listaNoti = new HashSet<INotificable>();

    }

    public void registrarServicio(INotificable servicio) {
        // TODO 8: Implemente este método para agregar un servicio al Set.
        listaNoti.add(servicio);

    }

    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Iniciando envío masivo de notificación: " + notificacion.getMensaje());
        // TODO 9: Itere sobre la colección de servicios y, para cada uno,
        // llame a su método 'enviar', pasándole la notificación.
        for (INotificable servicio : this.listaNoti) {
            servicio.enviar(notificacion);
        }

    }
}