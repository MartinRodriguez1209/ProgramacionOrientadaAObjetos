/**
 * "Producto Concreto" simple. No requiere un Builder.
 */
public class Moto implements Vehiculo {
    private final String tipoMotor;
    private final int cilindrada;

    public Moto() {
        this.tipoMotor = "4 Tiempos";
        this.cilindrada = 500; // Valor fijo para simplificar
    }

    @Override
    public void describir() {
        System.out.println("Moto creada: Motor " + tipoMotor + ", " + cilindrada + "cc.");
    }
}
