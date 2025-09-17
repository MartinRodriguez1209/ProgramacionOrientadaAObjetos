/**
 * "Creador Concreto" para objetos de tipo Auto.
 */
public class FabricaAutos extends FabricaVehiculos {

    @Override
    protected Vehiculo crearVehiculo() {
        // TODO: Tarea 3 - Usar el Builder de Auto para crear y devolver una instancia.

        return new Auto.Builder("motor").conAireAcondicionado(true).conCantidadPuertas(4).conGPS(true).construir();

    }
}