package clase6;

public class Notificacion {
    private String usuario;
    private String mensaje;

    public Notificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "Notificación para '" + usuario + "': " + mensaje;
    }
} 