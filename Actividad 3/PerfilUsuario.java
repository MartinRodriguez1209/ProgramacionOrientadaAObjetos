
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

// Archivo: PerfilUsuario.java
// TODO: Refactorizar esta clase para aplicar encapsulamiento.
public class PerfilUsuario {

    // Atributos públicos: ¡Vulnerabilidad!
    private String nombreUsuario;
    private String nombreCompleto;
    private String email;
    private int anioNacimiento;

    // TODO 1: Implementar un constructor que reciba y valide los datos esenciales.
    // Un perfil debe crearse con, al menos, un nombre de usuario y un email.
    public PerfilUsuario(String nombreUsuario, String email) {
        if (nombreUsuario != null && !nombreUsuario.isEmpty() && email != null && email.contains("@")) {
            this.nombreUsuario = nombreUsuario;
            this.email = email;
        } else {
            System.out.println("ERROR datos invalidos");
        }
    }

    // TODO 2: Implementar métodos públicos para acceder y modificar los atributos
    // de forma controlada (getters y setters).
    // --- Reglas de Negocio a Implementar ---
    // a) El 'nombreUsuario' no puede ser nulo ni estar vacío.
    // b) El 'email' debe contener el carácter '@'. (Validación simple).
    // c) El 'anioNacimiento' no puede ser un año futuro. (Validación simple).
    // d) Se debe poder cambiar el email, pero no el nombre de usuario una vez
    // creado
    public void setAnioNacimiento(int anioNacimiento) {
        Date fecha = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(fecha);
        if (anioNacimiento <= cal.get(Calendar.YEAR)) {
            this.anioNacimiento = anioNacimiento;
        } else {
            System.out.println("AÑO INVALIDO");
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error en el mail");
        }
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void mostrarPerfil() {
        System.out.println("--- Perfil del Usuario ---");
        System.out.println("Nombre de Usuario: " + this.nombreUsuario);
        System.out.println("Nombre Completo: " + this.nombreCompleto);
        System.out.println("Email: " + this.email);
        System.out.println("Año de Nacimiento: " + this.anioNacimiento);
        System.out.println("-------------------------");
    }

}
