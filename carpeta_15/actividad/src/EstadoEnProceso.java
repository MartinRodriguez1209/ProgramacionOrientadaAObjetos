public class EstadoEnProceso implements IEstadoPedido {

    @Override
    public IEstadoPedido procesarSiguientePaso(Pedido pedido) {
        System.out.println("Enviando Pedido #" + pedido.getId() + ". Pasa a ENVIADO.");
        return new EstadoEnviado();
    }

    @Override
    public IEstadoPedido cancelarPedido(Pedido pedido) {
        System.out.println("Cancelando Pedido #" + pedido.getId() + ".");
        return new EstadoCancelado();
    }

}
