package clase6;

// TODO 2: Declare la clase pública 'ServicioEmail'.
// La clase debe implementar la interfaz 'INotificable'.

// TODO 3: Implemente el método 'enviar' requerido por la interfaz.
// Dentro del método, simule el envío de un email imprimiendo un mensaje
// en la consola que incluya el usuario y el mensaje de la notificación.
// Ejemplo: "-> EMAIL enviado a [usuario]: [mensaje]"

public class ServicioEmail implements INotificable {

    @Override
    public void enviar(Notificacion noti) {
        System.out.println("Email enviado a " + noti.getUsuario() + ": " + noti.getMensaje());
    }
}