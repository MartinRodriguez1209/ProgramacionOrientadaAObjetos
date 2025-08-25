import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class FormatoCSV implements IFormato {

    @Override
    public String formatear(List<Map<String, String>> datos) {
        String contenido;
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
        return contenido;
    }

}
