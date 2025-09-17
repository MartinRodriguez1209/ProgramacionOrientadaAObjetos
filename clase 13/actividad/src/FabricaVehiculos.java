/**
 * El "Creador" abstracto en el patrón Factory Method.
 */
public abstract class FabricaVehiculos {

    public Vehiculo producirVehiculo() {
        // Obtiene el logger a través del Singleton para registrar la operación
        SistemaLog.getInstance().log(this.getClass().getSimpleName(), "Iniciando producción...");

        Vehiculo vehiculo = crearVehiculo();

        SistemaLog.getInstance().log(this.getClass().getSimpleName(), "Vehículo producido con éxito.");
        return vehiculo;
    }

    /**
     * Este es el Factory Method que las subclases deben implementar.
     */
    protected abstract Vehiculo crearVehiculo();
}
