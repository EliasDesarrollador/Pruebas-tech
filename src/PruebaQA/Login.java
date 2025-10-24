package PruebaQA;

import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);   // Creamos un objrto de tipo scanner 
		System.out.print("Ingrese su email: ");  // Pedimos al usuario su mail 
		String email = entrada.nextLine();  //Guardamos la entrada en una variable 
		System.out.print("Ingrese su contrasena :");  //Pedimos contrasena
		String password = entrada.nextLine();// Guardamos la contrasena 
		 
		// Validamos el mail y la contrasena 
		if (!email.contains("@")) {
			System.out.println("Email invalido");
		} else if  (password.length( ) <  8 ) {
			System.out.println("Contrasena demasiado corta ");
		} else {
			System.out.println("Login exitoso");
		}

	}

}
