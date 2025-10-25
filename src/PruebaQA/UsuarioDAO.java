package PruebaQA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UsuarioDAO {
	//Metodo para agregar usuario a la Base de datos 
	public boolean agregarUsuario(Usuario u ) {
		// Consulta SQL con parametros (?) para evitar sql injection
		String sql = "INSERT INTO usuarios (nombre, email, contrasena) VALUES  ( ?, ? ,?)";
		// try-with-resouces: cierra  la conexion automaticamente  cuando termina 
		try (Connection con = Conexion.getConnection();
				// Metodo preparestatemnet
				java.sql.PreparedStatement ps = con.prepareStatement(sql)){
			
			// Cargamos los valores  en los  ?  en el orden correcto 
			ps.setString(1, u.getNombre());   
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getcontrasena());
			
			//Ejecutamos la inserccion de  la DB
			ps.executeUpdate();
			return true; // Todo salio Bien 
			
		}catch (SQLException e ) {
			// Si hay error ,mostramos un mensaje para depurar
			System.out.println(" Error al intentar: " + e.getMessage());
			return false; // No se pudo insertar
		}
	}
	// Metodo  para listar Usuarios de la DB
	 public void listarUsuarios() {
		 // Consulta SQL  para traer toda las filas de la tabla usuarios
		 String sql = "SELECT  * FROM usuarios;";
		 
		 try (Connection con = Conexion.getConnection(); // abrimos la conexion 
				 PreparedStatement ps =  con.prepareStatement(sql); // Preparamos la consulta 
				 ResultSet  rs = ps.executeQuery())  {   // Ejecutamos y obtenemos los resultados
			 
			   System.out.println("--- LISTADO DE USUARIOS ---");
			   //Recorremos los regitros  ( filas)  que trajo la consulta 
			   while (rs.next()) {
				   System.out.println( 
						   "ID : " + rs.getInt("id")  + // Leemos la columna id 
						   "Nombre: " + rs.getString("nombre") + //Leemos la columna nombre
						   "Email: " + rs.getString("email") // Columna email
						   );
			   }
			 
		 } catch (SQLException e ) {
			 System.out.println("Error  al listar Usuarios : " + e.getMessage());
		 }
   }
		 // Metodo para actualizar  los datos de un  usuario  segun su ID
       public boolean actualizarUsuario(Usuario u ) {
			 
			 // Consulta SQL  para modificar  la fila donde coincide el ID
			 String sql = "UPDATE usuarios  SET nombre = ? , email = ? , contrasena = ?  WHERE id = ?";
			 
			 try (Connection con = Conexion.getConnection(); // Conexion con la DB
					 PreparedStatement ps = con.prepareStatement(sql))  // Preparamos la consulta 
					 
					// Cargamos los nuevos valores  para actualizar 
					 ps.setString(1, u.getNombre());     
					 ps.SetString(2,u.getEmail());
					 ps.SetString(3,u.getContrasena());
					 ps.setInt(4, u.getId));
					 
					 ps.executeUpdate() ;{ // Ejecutamos la actualizacion
						 return true; // Todo Bien 
						 
			}  catch (SQLException e ) {
			 System.out.println("Error al actualizar usuario : " + e.getMessage());
			 return false ;  // Algo sale mal
		 }
       }
}
			  
    
