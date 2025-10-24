package PruebaQA;

public class Main {
	public static void main(String[] args) {
		RegistroUsuario registro = new RegistroUsuario();
		
		System.out.println(registro.registrarUsuario("Elias", "elias@gmail.com", "1234"));
		System.out.println(registro.registrarUsuario("Juan", "juan@gmail.com", "j123"));
		System.out.println(registro.registrarUsuario("Liz", "liz@gmail.com", "l123"));
		
		System.out.println("Usuarios registrados : " + registro.cantidadUsuarios());
	}

}
