// Archivo: ProcesadorPedidos.java

public class ProcesadorPedidos {

    // Usamos un enum para representar los estados de forma simple
    public enum EstadoPedido {
        NUEVO,
        EN_PROCESO,
        ENVIADO,
        ENTREGADO,
        CANCELADO
    }

    private Pedido pedido;

    public ProcesadorPedidos(int idPedido) {
        this.idPedido = idPedido;
        this.estadoActual = EstadoPedido.NUEVO;
        System.out.println("Pedido #" + idPedido + " creado. Estado: " + this.estadoActual);
    }

    // Avanza el pedido al siguiente estado lógico
    public void procesarSiguientePaso() {
        switch (estadoActual) {
            case NUEVO:
                System.out.println("Procesando Pedido #" + idPedido + ". Pasa a EN_PROCESO.");
                this.estadoActual = EstadoPedido.EN_PROCESO;
                break;
            case EN_PROCESO:
                System.out.println("Enviando Pedido #" + idPedido + ". Pasa a ENVIADO.");
                this.estadoActual = EstadoPedido.ENVIADO;
                break;
            case ENVIADO:
                System.out.println("Entregando Pedido #" + idPedido + ". Pasa a ENTREGADO.");
                this.estadoActual = EstadoPedido.ENTREGADO;
                break;
            case ENTREGADO:
                System.out.println("El Pedido #" + idPedido + " ya fue entregado. No hay más pasos.");
                break;
            case CANCELADO:
                System.out.println("El Pedido #" + idPedido + " está cancelado. No se puede procesar.");
                break;
        }
    }

    // Permite cancelar el pedido si es posible
    public void cancelarPedido() {
        switch (estadoActual) {
            case NUEVO:
            case EN_PROCESO:
                System.out.println("Cancelando Pedido #" + idPedido + ".");
                this.estadoActual = EstadoPedido.CANCELADO;
                break;
            case ENVIADO:
            case ENTREGADO:
            case CANCELADO:
                System.out.println(
                        "No se puede cancelar el Pedido #" + idPedido + " en su estado actual: " + estadoActual);
                break;
        }
    }

    public EstadoPedido getEstadoActual() {
        return estadoActual;
    }

}