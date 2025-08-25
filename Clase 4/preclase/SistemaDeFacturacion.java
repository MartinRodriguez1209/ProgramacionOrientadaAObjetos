// Clase principal para probar el concepto.
public class SistemaDeFacturacion {
    public static void main(String[] args) {
        // Consultamos el estado global ANTES de crear objetos.
        System.out.println("La próxima factura a crear será la N°: " + Factura.getSiguienteNumeroDeFactura());

        // Creación de la primera factura.
        Factura f1 = new Factura();
        // Creación de objetos ItemFactura que colaborarán con la factura.
        ItemFactura item1 = new ItemFactura("Teclado Mecánico", 150.0);
        ItemFactura item2 = new ItemFactura("Mouse Gamer", 80.5);
        // Pasamos las referencias de los objetos item a la factura.
        f1.agregarItem(item1);
        f1.agregarItem(item2);

        // Creación de la segunda factura.
        Factura f2 = new Factura();
        f2.agregarItem(new ItemFactura("Monitor 24 pulgadas", 300.0));

        f1.imprimirDetalle();
        f2.imprimirDetalle();

        // Consultamos el estado global DESPUÉS de crear objetos.
        // El contador fue afectado por la creación de f1 y f2.
        System.out.println("La próxima factura a crear será la N°: " + Factura.getSiguienteNumeroDeFactura());
    }
}
