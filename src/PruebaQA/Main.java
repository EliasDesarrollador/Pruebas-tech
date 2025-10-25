package PruebaQA;

public class Main {
    public static void main(String[] args) {
          UsuarioDAO dao = new UsuarioDAO();
          Usuario u = new Usuario("Samuel", "sam@example.com", "123456");
          
          if (dao.agregarUsuario(u)) {
        	  System.out.print("Usuario insertado!!");
          }
    }
}
