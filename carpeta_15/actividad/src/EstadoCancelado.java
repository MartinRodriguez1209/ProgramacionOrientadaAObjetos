public class EstadoCancelado implements IEstadoPedido {

    @Override
    public IEstadoPedido procesarSiguientePaso(Pedido pedido) {
        System.out.println("El Pedido #" + pedido.getId() + " está cancelado. No se puede procesar.");
        return this;
    }

    @Override
    public IEstadoPedido cancelarPedido(Pedido pedido) {
        System.out.println("No se puede cancelar el Pedido #" + pedido + " en su estado actual: Cancelado ");
        return this;
    }

}
