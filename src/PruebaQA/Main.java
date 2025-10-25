package PruebaQA;

public class Main {
    public static void main(String[] args) {
          UsuarioDAO dao = new UsuarioDAO();
          dao.listarUsuarios(); // LLamamos al metodo ListarUsaurios
          dao.actualizarUsuario(); 
          
          // → Crear un usuario con datos nuevos
          Usuario u = new Usuario();
          u.setid(5); // ID del usuario que querés actualizar
          u.setNombre("Elías Ortiz");
          u.setEmail("eliasortiz@example.com");
          u.setContrasena("nuevo123");
       
    }
}
