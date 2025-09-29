public class App {
    public static void main(String[] args) {
        System.out.println("--- INICIO SIMULACIÓN ---");
        Pedido miPedido = new Pedido(101);

        miPedido.procesarSiguientePaso(); // Pasa a EN_PROCESO
        miPedido.cancelarPedido(); // Se puede cancelar, pasa a CANCELADO

        System.out.println("\n--- Nuevo Pedido ---");
        Pedido otroPedido = new Pedido(102);
        otroPedido.procesarSiguientePaso(); // Pasa a EN_PROCESO
        otroPedido.procesarSiguientePaso(); // Pasa a ENVIADO
        otroPedido.procesarSiguientePaso(); // Pasa a ENTREGADO
        otroPedido.procesarSiguientePaso(); // Ya no hace nada
        otroPedido.cancelarPedido(); // No se puede cancelar

        System.out.println("\n--- FIN SIMULACIÓN ---");
    }
}
