/**
 * "Producto Concreto" complejo. Su construcción debe ser refactorizada
 * para usar el patrón Builder.
 */
public class Auto implements Vehiculo {
    private final String motor;
    private final String carroceria;
    private final int cantidadPuertas;
    private final boolean tieneAireAcondicionado;
    private final boolean tieneGPS;

    // TODO: Tarea 2 - Reemplazar este constructor por uno privado que reciba un
    // Builder.
    public Auto(Builder builder) {
        this.motor = builder.motor;
        this.carroceria = builder.carroceria;
        this.cantidadPuertas = builder.cantidadPuertas;
        this.tieneAireAcondicionado = builder.tieneAireAcondicionado;
        this.tieneGPS = builder.tieneGPS;
    }

    @Override
    public void describir() {
        System.out.println("Auto creado: Motor=" + motor + ", Carrocería=" + carroceria +
                ", Puertas=" + cantidadPuertas + ", AC=" + tieneAireAcondicionado +
                ", GPS=" + tieneGPS);
    }

    // TODO: Tarea 2 - Crear la clase Builder anidada estática acá.
    // 1. Debe tener los mismos atributos que la clase Auto.
    // 2. El constructor del Builder debe recibir los atributos obligatorios.
    // 3. Debe tener métodos fluidos (que devuelvan 'this') para los atributos
    // opcionales.
    // 4. Debe tener un método construir() que devuelva una nueva instancia de Auto.

    public static class Builder {

        private final String motor;
        private String carroceria;
        private int cantidadPuertas;
        private boolean tieneAireAcondicionado;
        private boolean tieneGPS;

        public Builder(String motor) {
            this.motor = motor;
        }

        public Builder contCarroceria(String carroceria) {
            this.carroceria = carroceria;
            return this;
        }

        public Builder conCantidadPuertas(int cantidadPuertas) {
            this.cantidadPuertas = cantidadPuertas;
            return this;
        }

        public Builder conAireAcondicionado(boolean aireAcondicionado) {
            this.tieneAireAcondicionado = aireAcondicionado;
            return this;
        }

        public Builder conGPS(boolean gps) {
            this.tieneGPS = gps;
            return this;
        }

        public Auto construir() {
            return new Auto(this);
        }
    }
}
