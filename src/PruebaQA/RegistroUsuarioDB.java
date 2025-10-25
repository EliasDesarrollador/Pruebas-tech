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
					 
				}
	    }
}
