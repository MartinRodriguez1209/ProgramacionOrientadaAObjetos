import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.ArrayList;
import java.util.HashMap;

public class ReporteManager {

    public void exportar(List<Map<String, String>> datos, String nombreArchivo, String formato) throws IOException {
        if (datos == null || datos.isEmpty()) {
            System.out.println("No hay datos para exportar.");
            return;
        }

        String contenido;

        if (formato.equalsIgnoreCase("CSV")) {
            System.out.println("Generando contenido CSV...");
            StringBuilder csvBuilder = new StringBuilder();
            String[] headers = datos.get(0).keySet().toArray(new String[0]);
            csvBuilder.append(String.join(",", headers)).append("\n");
            for (Map<String, String> fila : datos) {
                StringJoiner filaJoiner = new StringJoiner(",");
                for (String header : headers) {
                    filaJoiner.add(fila.get(header));
                }
                csvBuilder.append(filaJoiner.toString()).append("\n");
            }
            contenido = csvBuilder.toString();

        } else if (formato.equalsIgnoreCase("JSON")) {
            System.out.println("Generando contenido JSON...");
            StringBuilder jsonBuilder = new StringBuilder();
            jsonBuilder.append("[\n");
            for (int i = 0; i < datos.size(); i++) {
                Map<String, String> fila = datos.get(i);
                jsonBuilder.append("\t{\n");
                StringJoiner campoJoiner = new StringJoiner(",\n");
                for (Map.Entry<String, String> entry : fila.entrySet()) {
                    String campo = "\t\t\"" + entry.getKey() + "\": \"" + entry.getValue() + "\"";
                    campoJoiner.add(campo);
                }
                jsonBuilder.append(campoJoiner.toString()).append("\n\t}");
                if (i < datos.size() - 1) {
                    jsonBuilder.append(",\n");
                } else {
                    jsonBuilder.append("\n");
                }
            }
            jsonBuilder.append("]");
            contenido = jsonBuilder.toString();

        } else {
            throw new IllegalArgumentException("Formato no soportado: " + formato);
        }

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
        
        try {
            manager.exportar(datosProductos, "reporte.csv", "CSV");
            System.out.println("---------------------------------");
            manager.exportar(datosProductos, "reporte.json", "JSON");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}