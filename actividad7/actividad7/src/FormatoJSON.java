import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class FormatoJSON implements IFormato {

    @Override
    public String formatear(List<Map<String, String>> datos) {
        String contenido;
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
        return contenido;
    }

}