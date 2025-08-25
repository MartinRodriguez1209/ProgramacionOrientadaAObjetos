import java.util.Date;

public class GestionAcademica {

    public static void main(String[] args) {
        System.out.println("== Sistema de Gestión Académica ==");

        Estudiante estu1 = new Estudiante("Martin", "Rodriguez");
        Estudiante estu2 = new Estudiante("Matias", "Zahn");
        Estudiante estu3 = new Estudiante("Alexis", "Coronel");
        Estudiante estu4 = new Estudiante("Juani", "Zamit");

        Curso miCurso = new Curso("Curso POO", 2);

        System.out.println(miCurso.inscribirEstudiante(estu1).toString());
        System.out.println(miCurso.inscribirEstudiante(estu2).toString());
        System.out.println(miCurso.inscribirEstudiante(estu3).toString());
        System.out.println(miCurso.inscribirEstudiante(estu4).toString());
        miCurso.mostrarInscriptos();
        Estudiante estu5 = new Estudiante("Pepe", "Pepin");
        System.out.println(estu5.toString());

        /*
         * TAREA: Realizar las siguientes acciones en este método main.
         * 1. Crear 3 o 4 objetos de tipo Estudiante con nombres y apellidos.
         * 
         * 2. Crear un objeto de tipo Curso (ej. "Programación Orientada a Objetos") con
         * un cupo máximo de 2.
         * 
         * 3. Intentar inscribir a los 3 primeros estudiantes en el curso.
         * Imprimir por consola un mensaje que indique si la inscripción fue exitosa o
         * si se rechazó por falta de cupo.
         * 
         * 4. Mostrar el listado final de inscriptos en el curso.
         * 
         * 5. Crear un nuevo estudiante. Imprimir su `toString()` para verificar que su
         * legajo
         * es correlativo al de los anteriores, demostrando el funcionamiento del
         * `static`.
         * 
         * Ejemplo de cómo se vería una parte del código:
         * Estudiante e1 = new Estudiante("Juan", "Perez");
         * System.out.println("Creado: " + e1);
         * Curso poo = new Curso("Programación II", 2);
         * if (poo.inscribirEstudiante(e1)) {
         * System.out.println("Inscripción de " + e1.getLegajo() + " exitosa.");
         * } else {
         * System.out.println("Inscripción de " + e1.getLegajo() +
         * " rechazada. Cupo completo.");
         * }
         */
    }
}
