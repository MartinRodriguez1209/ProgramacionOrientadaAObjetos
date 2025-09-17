public class CheckoutFacade {
    // TODO: Declarar instancias de los subsistemas.
    // TODO: Implementar el constructor para inicializar los subsistemas.

    public void procesarPedido(ComponenteCarrito carrito, String clienteInfo) {
        System.out.println("--- Iniciando proceso de checkout simplificado ---");
        // TODO: Orquestar las llamadas al subsistema en el orden correcto:
        // 1. Verificar stock.
        SistemaInventario inventario = new SistemaInventario();

        inventario.verificarStock(carrito);
        // 2. Procesar el pago (obtener el monto total del carrito).
        PasarelaDePago pasarelaDePago = new PasarelaDePago();
        pasarelaDePago.procesarPago(carrito.obtenerPrecio());

        // 3. Coordinar el envío.
        ServicioEnvio servicioEnvio = new ServicioEnvio();
        servicioEnvio.coordinarEnvio(clienteInfo);

        System.out.println("--- Pedido procesado con éxito ---");
    }
}