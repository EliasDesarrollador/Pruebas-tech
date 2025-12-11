package PruebaQA;

public class Main {
    public static void main(String[] args) {
          if ( Conexion.getConnection() != null) {
        	  System.out.println("Conexion exitosa a Base de datos PostgreSQL !");
          }  else {
        	  System.out.println("No se  pudo conectar");
          }
    }
}
