import java.util.Optional;

import dao.DAO;
import dao.TareaDAOImpl;
import model.Tarea;

public class Main {
    public static void main(String[] args) {
        DAO<Tarea> tareaDAO = new TareaDAOImpl();

        System.out.println("--- Creando tareas ---");
        tareaDAO.create(new Tarea("Estudiar patrones de diseño"));
        tareaDAO.create(new Tarea("Hacer la compra"));

        System.out.println("\n--- Leyendo todas las tareas ---");
        tareaDAO.findAll().forEach(System.out::println);

        System.out.println("\n--- Leyendo tarea con ID 1 ---");
        Optional<Tarea> tarea = tareaDAO.read(1);
        tarea.ifPresent(t -> {
            System.out.println("Tarea encontrada: " + t);
            System.out.println("\n--- Actualizando tarea con ID 1 ---");
            t.setDescripcion("Estudiar patrones DAO y Singleton APROBADO");
            t.setCompletada(true);
            tareaDAO.update(t);
        });

        System.out.println("\n--- Verificando actualización ---");
        tareaDAO.read(1).ifPresent(System.out::println);

        System.out.println("\n--- Eliminando tarea con ID 2 ---");
        tareaDAO.delete(2);

        System.out.println("\n--- Lista final de tareas ---");
        tareaDAO.findAll().forEach(System.out::println);
    }
}