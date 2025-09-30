package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorDeConexion {

    private static GestorDeConexion instancia;
    private Connection conexion;

    private static final String URL = "jdbc:sqlite:tareas.db";

    private GestorDeConexion() {
        try {
            this.conexion = DriverManager.getConnection(URL);
            inicializarBaseDeDatos();
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }

    // TODO: Implementar el método estático getInstancia() para el Singleton.
    public static synchronized GestorDeConexion getInstancia() {
        // ... Lógica para crear la instancia si es null y devolverla.
        if (instancia == null) {
            instancia = new GestorDeConexion();
        }
        return instancia;
    }

    public Connection getConexion() {
        return this.conexion;
    }

    private void inicializarBaseDeDatos() {
        try (Statement stmt = this.conexion.createStatement()) {
            // TODO: Escribir la sentencia SQL para crear la tabla "tareas".
            // La tabla debe tener los campos:
            // - id: INTEGER PRIMARY KEY AUTOINCREMENT
            // - descripcion: TEXT NOT NULL
            // - completada: BOOLEAN NOT NULL
            String sqlCreateTable = "CREATE TABLE IF NOT EXISTS tareas (id INTEGER PRIMARY KEY AUTOINCREMENT, descripcion TEXT NOT NULL, completada BOOLEAN NOT NULL)";

            stmt.execute(sqlCreateTable);
            System.out.println("Tabla 'tareas' creada o ya existente.");

        } catch (SQLException e) {
            System.err.println("Error al inicializar la base de datos: " + e.getMessage());
        }
    }
}