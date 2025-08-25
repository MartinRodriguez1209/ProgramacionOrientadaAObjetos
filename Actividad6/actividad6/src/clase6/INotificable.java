package clase6;
// TODO 1: Definir la interfaz pública INotificable.

// La interfaz debe declarar la firma de un único método llamado 'enviar'.
// El método no debe retornar ningún valor (void) y debe aceptar como 
// único parámetro un objeto de tipo Notificacion.

public interface INotificable {

    public void enviar(Notificacion noti);

}