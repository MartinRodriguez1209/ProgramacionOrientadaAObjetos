// Archivo: TesteoPerfil.java
// Esta clase no debe ser modificada. Su propósito es verificar la correcta
// refactorización de la clase PerfilUsuario.

import java.util.Calendar;

public class TesteoPerfil {

    public static void main(String[] args) {

        System.out.println("--- Creando perfiles con el diseño original (inseguro) ---");

        // Creación de un objeto sin datos iniciales
        // PerfilUsuario perfil1 = new PerfilUsuario();
        // // Acceso y modificación directa: ¡PELIGRO!
        // perfil1.nombreUsuario = "admin";
        // perfil1.email = "correo-invalido"; // Un email sin '@'
        // perfil1.anioNacimiento = 2050; // Un año futuro
        // perfil1.nombreCompleto = "Administrador del Sistema";
        // System.out.println("Perfil 1 (datos inconsistentes):");
        // perfil1.mostrarPerfil();
        // // Intento de crear un perfil con datos nulos
        // PerfilUsuario perfil2 = new PerfilUsuario();
        // perfil2.nombreUsuario = null; // Un nombre de usuario nulo
        // perfil2.email = "otro@correo.com";
        // System.out.println("\nPerfil 2 (datos nulos):");
        // perfil2.mostrarPerfil();
        // Después de refactorizar PerfilUsuario, las líneas de código anteriores
        // deberían generar errores de compilación o ser manejadas por la lógica de la clase.
        System.out.println("\n--- Probando el NUEVO diseño seguro (descomentar luego de refactorizar) ---");

        // DESCOMENTAR ESTA SECCIÓN TRAS LA REFACTORIZACIÓN
        // Caso 1: Creación exitosa con el constructor
        System.out.println("\nIntentando crear un perfil válido...");
        PerfilUsuario perfilSeguro1 = new PerfilUsuario("juan.perez", "juan.perez@dominio.com");
        perfilSeguro1.setNombreCompleto("Juan Pérez");
        perfilSeguro1.setAnioNacimiento(1990);
        perfilSeguro1.mostrarPerfil();

        // Caso 2: Intento de creación con datos inválidos
        System.out.println("\nIntentando crear un perfil con email inválido...");
        PerfilUsuario perfilSeguro2 = new PerfilUsuario("ana.gomez", "ana.gomez.invalido");
        // El constructor o los setters deberían advertir del error.

        // Caso 3: Modificación controlada
        System.out.println("\nIntentando cambiar el email a un valor válido...");
        perfilSeguro1.setEmail("juan.nuevo@dominio.com");
        perfilSeguro1.mostrarPerfil();

        System.out.println("\nIntentando cambiar el año a un valor futuro...");
        perfilSeguro1.setAnioNacimiento(Calendar.getInstance().get(Calendar.YEAR) + 1);
        // El setter debería impedir esta acción.
        perfilSeguro1.mostrarPerfil();

        // Caso 4: Intentar cambiar el nombre de usuario (no debería ser posible)
        // perfilSeguro1.setNombreUsuario("jperez_nuevo"); // Esta línea debería dar error de compilación.
    }
}
