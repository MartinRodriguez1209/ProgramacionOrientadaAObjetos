public class EstadoEnviado implements IEstadoPedido {

    @Override
    public IEstadoPedido procesarSiguientePaso(Pedido pedido) {
        System.out.println("Entregando Pedido #" + pedido.getId() + ". Pasa a ENTREGADO.");
        return new EstadoEntregado();
    }

    @Override
    public IEstadoPedido cancelarPedido(Pedido pedido) {
        System.out.println(
                "No se puede cancelar el Pedido #" + pedido.getId() + " en su estado actual: Enviado");
        return this;
    }

}
