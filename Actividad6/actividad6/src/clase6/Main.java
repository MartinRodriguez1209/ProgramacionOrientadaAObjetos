package clase6;

public class Main {
    public static void main(String[] args) {
        SistemaNotificaciones sistema = new SistemaNotificaciones();

        // TODO 10: Cree instancias de ServicioEmail y ServicioSms.

        ServicioEmail email = new ServicioEmail();
        ServicioSms sms = new ServicioSms();
        // TODO 11: Registre ambas instancias en el objeto 'sistema'.
        sistema.registrarServicio(email);
        sistema.registrarServicio(sms);
        // TODO 12: Cree una nueva notificación y envíela a través del sistema.
        Notificacion miNoti = new Notificacion("Martin", "Hola notificacion 1");
        sistema.enviarNotificacion(miNoti);
        System.out.println("\n--- Intentando registrar un servicio duplicado ---");
        // TODO 13: Intente registrar nuevamente la instancia de ServicioEmail.
        // Observe el comportamiento (no debería agregarse si se usó Set).
        sistema.registrarServicio(sms);
        // TODO 14: Cree y envíe una segunda notificación.
        Notificacion miNoti2 = new Notificacion("Matias", "Hola notificacion 2");
        sistema.enviarNotificacion(miNoti2);
        // TODO 15: Analice en equipo y responda mediante comentarios aquí mismo:
        // a) ¿Cuál es la ventaja de que SistemaNotificaciones dependa de INotificable
        // y no de ServicioEmail o ServicioSms directamente?
        // b) Si mañana se necesitara agregar un ServicioPushNotification, ¿qué archivos
        // se necesitarían crear o modificar? ¿Sería necesario cambiar
        // SistemaNotificaciones.java?
    }
}