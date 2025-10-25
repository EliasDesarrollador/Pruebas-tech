package PruebaQA;

import java.util.ArrayList;
import java.util.List;

public class RegistroUsuario {
	private List<Usuario> usuariosRegistrados = new ArrayList();
	
	public  String registrarUsuario(String nombre, String email , String password) {
		if (nombre.isEmpty() || email.isEmpty()  || password.isEmpty() ) {
			return "Error : Campos vacios";
		}
		for (Usuario u  :  usuariosRegistrados) {
			if (u.getEmail().equalsIgnoreCase(email)) {
				return "Email ya registrado";
			}
		}
		
		usuariosRegistrados.add(new Usuario(nombre, email, password));
		return "Registrado con exito";
	}
	
	public int cantidadUsuarios() {
		return usuariosRegistrados.size();
	}
}
