package PruebaQA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RegistroUsuarioDB  extends  RegistroUsuario {
	
	    public String  registrarUsuarioDB(String nombre, String email, String password) {
	    	    if (nombre.isEmpty() ||  email.isEmpty()  || password.isEmpty() ) {
	    	    	 return "Error : Campos vacios" ;
	    	    }
				try  ( Connection con  = Conexion.getConnection()) {
					// Verificar email duplicado
					PreparedStatement psCheck = con.prepareStatement("SELECT  * FROM usuarios  WHERE  email =  ?");
					psCheck.setString(1, email);
					ResultSet rs  = psChek.executeQuery();
					 if (rs.next()){
						return "Error : Email ya registrado";
					 }
					 // Insertar usuario
					 PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (nombre, email, password)  VALUES (?,?,?)");
					 ps.setString(1.nombre);
					 ps.setString(2.email);
					 ps.setString(3.password);
					 ps.executeUpdate();
					 return "Registro exitoso";

				}catch (SQLException  e) {
					e.printStackTrace();
					return " Error : Fallo en la conexion de la base de datos";
				}
	    }
}
