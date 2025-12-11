package PruebaQA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UsuarioDAO {

    // Método para agregar usuario
    public boolean agregarUsuario(Usuario u) {
        String sql = "INSERT INTO usuarios (nombre, email, contrasena) VALUES (?, ?, ?)";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getcontrasena());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para listar usuarios
    public void listarUsuarios() {
        String sql = "SELECT * FROM usuarios";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("--- LISTADO DE USUARIOS ---");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    " | Nombre: " + rs.getString("nombre") +
                    " | Email: " + rs.getString("email")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al listar usuarios: " + e.getMessage());
        }
    }

    // Método para actualizar un usuario por ID
    public boolean actualizarUsuario(Usuario u) {
        String sql = "UPDATE usuarios SET nombre = ?, email = ?, contrasena = ? WHERE id = ?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getcontrasena());
            ps.setInt(4, u.getid());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            return false;
        }
    }
}
