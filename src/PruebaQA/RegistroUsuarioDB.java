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
	    }
	
	

}
