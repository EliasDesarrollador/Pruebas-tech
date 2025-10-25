package PruebaQA;

import java.sql.Connection;
import java.util.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
	
	public boolean agregarUsuario(Usuario u ) {
		String sql = "INSERT INTO usuarios (nombre, email, contrasena) VALUES  ( ?, ? ,?)";
		
		
		try (Connection con = Conexion.getConnection();
				java.sql.PreparedStatement ps = con.prepareStatement(sql)){
			
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getcontrasena());
			
			
			ps.executeUpdate();
			return true;
			
		}catch (SQLException e ) {
			System.out.println(" Error al intentar: " + e.getMessage());
			return false;
			
		
		}
	}

}
