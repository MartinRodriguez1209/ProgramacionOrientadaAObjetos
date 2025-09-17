/**
 * Clase principal para probar la implementación de los patrones.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Iniciando simulación de fábrica de vehículos ---");

        // TODO: Descomentar y probar una vez que los patrones estén implementados.

        // 1. Probar Singleton
        SistemaLog logger1 = SistemaLog.getInstance();
        SistemaLog logger2 = SistemaLog.getInstance();
        logger1.log("Principal", "Verificando unicidad del logger.");
        if (logger1 == logger2) {
            System.out.println("Resultado: Singleton funciona, ambas variables apuntan a la misma instancia.");
        } else {
            System.out.println("Resultado: Singleton falló, se crearon instancias diferentes.");
        }

        System.out.println("\n--- Produciendo una Moto ---");
        FabricaVehiculos fabricaMotos = new FabricaMotos();
        Vehiculo miMoto = fabricaMotos.producirVehiculo();
        miMoto.describir();

        System.out.println("\n--- Produciendo un Auto ---");
        FabricaVehiculos fabricaAutos = new FabricaAutos();
        Vehiculo miAuto = fabricaAutos.producirVehiculo();
        miAuto.describir();

    }
}