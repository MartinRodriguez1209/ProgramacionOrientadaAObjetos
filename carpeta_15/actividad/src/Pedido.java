public class Pedido {

    private int idPedido;
    private IEstadoPedido estadoActualPedido;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.estadoActualPedido = new EstadoNuevo();
        System.out.println("Pedido #" + idPedido + " creado. Estado: ");
    }

    public int getId() {
        return this.idPedido;
    }

    public void procesarSiguientePaso() {
        estadoActualPedido = estadoActualPedido.procesarSiguientePaso(this);
    }

    public void cancelarPedido() {
        estadoActualPedido = estadoActualPedido.cancelarPedido(this);
    }

}
