
import java.util.ArrayList;

public class Curso {

    // Atributos de instancia
    private String nombreCurso;
    private int cupoMaximo;
    // Un curso tiene una lista de estudiantes inscriptos (colaboración)
    private ArrayList<Estudiante> inscriptos;

    public Curso(String nombreCurso, int cupoMaximo) {
        this.nombreCurso = nombreCurso;
        this.cupoMaximo = cupoMaximo;
        this.inscriptos = new ArrayList<>();
    }

    /**
     * Inscribe un estudiante en el curso. TAREA: Implementar la lógica de este
     * método. Debe verificar si todavía hay cupo disponible. Si hay cupo,
     * agrega el estudiante a la lista de inscriptos y retorna 'true'. Si no hay
     * cupo, no lo agrega y retorna 'false'.
     *
     * @param unEstudiante El objeto Estudiante a inscribir.
     * @return true si la inscripción fue exitosa, false en caso contrario.
     */
    public Boolean inscribirEstudiante(Estudiante unEstudiante) {
        if (inscriptos.size() < cupoMaximo) {
            inscriptos.add(unEstudiante);
            return true;
        }
        return false;
    }

    public void mostrarInscriptos() {
        System.out.println("-----------------------------------------");
        System.out.println("Listado de Inscriptos para el curso: " + this.nombreCurso);
        System.out.println("Cupo: " + this.inscriptos.size() + "/" + this.cupoMaximo);
        System.out.println("-----------------------------------------");
        for (Estudiante e : this.inscriptos) {
            System.out.println(e.toString());
        }
        System.out.println("-----------------------------------------");
    }

    public ArrayList<Estudiante> getInscriptos() {
        return inscriptos;
    }
}
