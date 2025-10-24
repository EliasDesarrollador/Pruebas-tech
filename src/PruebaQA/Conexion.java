package PruebaQA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
       private  static final String URL = "Jdbc: postgresql://localhost:5432/DBLocal";
       private static  final String USER = "postgres";
       private static  final String PASS ="password";
       
       public static Connection getConnection() throws SQLException {
    	   return DriverManager.getConnection(URL, USER, PASS);
       }
}
