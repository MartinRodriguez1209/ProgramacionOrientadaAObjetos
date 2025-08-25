// Clase que representa una factura.
public class Factura {
    // ATRIBUTO ESTÁTICO: Compartido por TODAS las facturas.
    // Se inicializa una sola vez cuando la clase es cargada.
    private static int proximoNumeroFactura = 1;

    // ATRIBUTOS DE INSTANCIA: Cada factura tiene su propia copia.
    private int numero;
    private double total;
    // Una factura "tiene" o "se compone de" items. Colaboración de objetos.
    private java.util.ArrayList<ItemFactura> items;

    public Factura() {
        // Asigna el número correlativo y luego lo incrementa para la próxima.
        this.numero = proximoNumeroFactura++;
        this.total = 0.0;
        this.items = new java.util.ArrayList<>();
    }

    // MÉTODO DE INSTANCIA: Opera sobre el estado de esta factura.
    // Recibe un OBJETO por "valor de la referencia".
    public void agregarItem(ItemFactura item) {
        if (item != null) {
            this.items.add(item);
            this.total += item.getPrecioUnitario(); // Modifica el estado de la instancia.
        }
    }

    public void imprimirDetalle() {
        System.out.println("------------------------------------");
        System.out.println("Factura N°: " + this.numero);
        System.out.println("------------------------------------");
        for (ItemFactura item : this.items) {
            System.out.println(item.toString()); // Invocando un método del objeto colaborador.
        }
        System.out.println("------------------------------------");
        System.out.println("Total a Pagar: $" + this.total);
        System.out.println("------------------------------------");
    }

    // MÉTODO ESTÁTICO: No pertenece a ninguna factura en particular.
    // Provee información global de la clase.
    public static int getSiguienteNumeroDeFactura() {
        // ERROR: La siguiente línea no compilaría.
        // System.out.println(this.numero); // No hay 'this' en un contexto estático.
        return proximoNumeroFactura;
    }
}
