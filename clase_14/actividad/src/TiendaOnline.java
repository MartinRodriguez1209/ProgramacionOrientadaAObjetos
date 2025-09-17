public class TiendaOnline {
    public static void main(String[] args) {
        System.out.println("--- Bienvenido a la Tienda Online ---");
        // TODO: Descomentar y probar una vez que los patrones estén implementados.

        // 1. Probar Composite
        Producto mouse = new Producto("Mouse Gamer", 30000.0);
        Producto teclado = new Producto("Teclado Mecánico", 70000.0);
        KitProductos kitGamer = new KitProductos("Kit Gamer Básico");
        kitGamer.agregarItem(mouse);
        kitGamer.agregarItem(teclado);
        System.out.println("\n--- Probando Composite ---");
        System.out.println(kitGamer.getDescripcion() + " - Precio: $" + kitGamer.obtenerPrecio());

        // 2. Probar Decorator sobre un producto simple
        System.out.println("\n--- Probando Decorator ---");
        ComponenteCarrito mouseConGarantia = new GarantiaExtendidaDecorator(mouse);
        System.out.println(mouseConGarantia.getDescripcion() + " - Precio: $" + mouseConGarantia.obtenerPrecio());

        // 3. Probar Decorator sobre un Composite
        System.out.println("\n--- Decorando un Kit Completo ---");
        ComponenteCarrito kitConGarantia = new GarantiaExtendidaDecorator(kitGamer);
        System.out.println(kitConGarantia.getDescripcion() + " - Precio: $" + kitConGarantia.obtenerPrecio());

        // 4. Probar Facade
        System.out.println("\n--- Procesando la compra con Facade ---");
        CheckoutFacade checkout = new CheckoutFacade();
        checkout.procesarPedido(kitConGarantia, "Juan Perez, Calle Falsa 123");

    }
}