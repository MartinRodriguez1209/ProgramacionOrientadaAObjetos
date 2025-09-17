class SistemaInventario {
    public void verificarStock(ComponenteCarrito carrito) { System.out.println("Inventario: Stock verificado para " + carrito.getDescripcion()); }
}
class PasarelaDePago {
    public void procesarPago(double monto) { System.out.println("Pago: Procesando pago por $" + monto); }
}
class ServicioEnvio {
    public void coordinarEnvio(String clienteInfo) { System.out.println("Envío: Despachando pedido a " + clienteInfo); }
}
