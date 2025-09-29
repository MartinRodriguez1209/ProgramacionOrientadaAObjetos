public interface IEstadoPedido {

    public IEstadoPedido procesarSiguientePaso(Pedido pedido);

    public IEstadoPedido cancelarPedido(Pedido pedido);

}