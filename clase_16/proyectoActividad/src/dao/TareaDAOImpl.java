package dao;

import db.GestorDeConexion;
import model.Tarea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TareaDAOImpl implements DAO<Tarea> {

    private Connection conexion = GestorDeConexion.getInstancia().getConexion();

    @Override
    public void create(Tarea tarea) {
        // TODO: Implementar la inserción de una nueva tarea en la BD.
        String sql = "INSERT INTO tareas(descripcion, completada) VALUES(?, ?)";
        // ... tu código con PreparedStatement aquí
        try (PreparedStatement pstmt = this.conexion.prepareStatement(sql)) {
            pstmt.setString(1, tarea.getDescripcion());
            pstmt.setBoolean(2, tarea.isCompletada());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Optional<Tarea> read(int id) {
        // TODO: Implementar la lectura de una tarea por su ID.
        String sql = "SELECT * FROM tareas WHERE id = ?";
        Tarea tarea = null;
        // ... tu código con PreparedStatement y ResultSet aquí
        try (PreparedStatement pstmt = this.conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                tarea = new Tarea();
                tarea.setId(rs.getInt("id"));
                tarea.setDescripcion(rs.getString("descripcion"));
                tarea.setCompletada(rs.getBoolean("completada"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error al leer la tarea: " + e.getMessage());
        }
        return Optional.ofNullable(tarea); // Reemplazar
    }

    @Override
    public void update(Tarea tarea) {
        // TODO: Implementar la actualización de una tarea existente.
        String sql = "UPDATE tareas SET descripcion = ?, completada = ? WHERE id = ?";
        // ... tu código con PreparedStatement aquí
        try (PreparedStatement pstmt = this.conexion.prepareStatement(sql)) {
            pstmt.setString(1, tarea.getDescripcion());
            pstmt.setBoolean(2, tarea.isCompletada());
            pstmt.setInt(3, tarea.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error al actualizar la tarea: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        // TODO: Implementar la eliminación de una tarea por su ID.
        String sql = "DELETE FROM tareas WHERE id = ?";
        // ... tu código con PreparedStatement aquí
        try (PreparedStatement pstmt = this.conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error al eliminar la tarea: " + e.getMessage());
        }
    }

    @Override
    public List<Tarea> findAll() {
        List<Tarea> tareas = new ArrayList<>();
        // TODO: Implementar la lectura de todas las tareas de la BD.
        Tarea tarea = null;
        String sql = "SELECT * FROM tareas";
        // ... tu código con Statement y ResultSet aquí
        try (Statement stmt = this.conexion.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tarea = new Tarea();
                tarea.setId(rs.getInt("id"));
                tarea.setCompletada(rs.getBoolean("completada"));
                tarea.setDescripcion(rs.getString("descripcion"));
                tareas.add(tarea);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener todas las tareas: " + e.getMessage());
        }
        return tareas;
    }
}