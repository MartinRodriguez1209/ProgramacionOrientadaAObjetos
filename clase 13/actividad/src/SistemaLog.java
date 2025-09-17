/**
 * Clase a implementar con el patrón Singleton.
 * Será el punto centralizado para registrar todos los eventos de la aplicación.
 */
public class SistemaLog {
    // TODO: Tarea 1 - Implementar el patrón Singleton acá.
    // 1. Añadir un atributo estático y privado para la instancia.
    private static SistemaLog instancia;

    // 2. Hacer el constructor privado.
    private SistemaLog() {
        System.out.println("--> Logger inicializado. Archivo de log abierto.");
    }

    // 3. Crear el método estático y público getInstance().

    public static SistemaLog getInstance() {
        if (instancia == null) {
            instancia = new SistemaLog();
        }
        return instancia;

    }

    // Ejemplo de método de negocio
    public void log(String modulo, String mensaje) {
        System.out.println("[LOG] [" + modulo + "] " + mensaje);
    }
}
