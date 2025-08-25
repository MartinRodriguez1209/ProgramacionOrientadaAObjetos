import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ReporteManager {

    public void exportar(List<Map<String, String>> datos, String nombreArchivo, IFormato formato) throws IOException {
        if (datos == null || datos.isEmpty()) {
            System.out.println("No hay datos para exportar.");
            return;
        }

        String contenido;
        contenido = formato.formatear(datos);

        Files.write(Paths.get(nombreArchivo), contenido.getBytes());
        System.out.println("Archivo '" + nombreArchivo + "' creado exitosamente.");
    }

    public static void main(String[] args) {
        ReporteManager manager = new ReporteManager();

        List<Map<String, String>> datosProductos = new ArrayList<>();
        Map<String, String> producto1 = new HashMap<>();
        producto1.put("id", "101");
        producto1.put("nombre", "Teclado Mecanico");
        producto1.put("stock", "42");
        datosProductos.add(producto1);

        Map<String, String> producto2 = new HashMap<>();
        producto2.put("id", "102");
        producto2.put("nombre", "Mouse Gamer");
        producto2.put("stock", "78");
        datosProductos.add(producto2);

        System.out.println("--- INICIO DE EXPORTACIÓN ---");

        FormatoCSV formatoCSV = new FormatoCSV();
        FormatoJSON formatoJSON = new FormatoJSON();

        try {
            manager.exportar(datosProductos, "reporte.csv", formatoCSV);
            System.out.println("---------------------------------");
            manager.exportar(datosProductos, "reporte.json", formatoJSON);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}