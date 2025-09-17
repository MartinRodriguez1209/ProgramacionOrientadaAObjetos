public class GarantiaExtendidaDecorator extends ServicioAdicionalDecorator {

    public GarantiaExtendidaDecorator(ComponenteCarrito producto) {
        this.componenteEnvuelto = producto;
    }

    @Override
    public double obtenerPrecio() {
        return this.componenteEnvuelto.obtenerPrecio() + 5000;
    }

    @Override
    public String getDescripcion() {
        return this.componenteEnvuelto.getDescripcion() + " Garantia Extendida";
    }
    // TODO: Implementar constructor.
    // TODO: Sobrescribir obtenerPrecio() para añadir el costo de la garantía (ej:
    // 5000.0)
    // al precio del componente envuelto.
    // TODO: Sobrescribir getDescripcion() para añadir "+ Garantía Extendida" a la
    // descripción.
}