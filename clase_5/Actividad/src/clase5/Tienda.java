package clase5;

public class Tienda {

    public static void main(String[] args) {
        System.out.println("--- Catálogo de la Tienda ---");

        // TODO: Una vez implementadas las clases, descomentar este bloque para probar.
        Libro libroPOO = new Libro("123456789", "Java How to Program", 50000.0, "Deitel", "978-0134670942");
        Electronico notebook = new Electronico("NTBK-001", "Notebook Gamer", 1750000.0, "Asus", 24);

        System.out.println("\n--- Detalles del Libro ---");
        libroPOO.mostrarDetalle();
        System.out.println("\n--- Detalles del Electrónico ---");
        notebook.mostrarDetalle();
    }
}
