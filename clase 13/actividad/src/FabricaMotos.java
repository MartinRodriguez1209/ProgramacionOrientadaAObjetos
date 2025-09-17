/**
 * "Creador Concreto" para objetos de tipo Moto.
 */
public class FabricaMotos extends FabricaVehiculos {
    
    @Override
    protected Vehiculo crearVehiculo() {
        // La creación de una Moto es simple y directa.
        return new Moto();
    }
}