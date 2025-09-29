public class EstadoNuevo implements IEstadoPedido {

    @Override
    public String toString() {
        return "Estado nuevo";
    }

    @Override
    public IEstadoPedido procesarSiguientePaso(Pedido pedido) {
        System.out.println("Procesando Pedido #" + pedido.getId() + ". Pasa a EN_PROCESO.");
        return new EstadoEnProceso();
    }

    @Override
    public IEstadoPedido cancelarPedido(Pedido pedido) {
        System.out.println(
                "No se puede cancelar el Pedido #" + pedido.getId() + " en su estado actual: Nuevo");
        return this;
    }

}
