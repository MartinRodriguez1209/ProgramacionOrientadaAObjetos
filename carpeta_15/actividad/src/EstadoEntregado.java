public class EstadoEntregado implements IEstadoPedido {

    @Override
    public IEstadoPedido procesarSiguientePaso(Pedido pedido) {
        System.out.println("El Pedido #" + pedido.getId() + " ya fue entregado. No hay más pasos.");
        return this;
    }

    @Override
    public IEstadoPedido cancelarPedido(Pedido pedido) {
        System.out.println(
                "No se puede cancelar el Pedido #" + pedido.getId() + " en su estado actual: Entregado");
        return this;
    }

}
