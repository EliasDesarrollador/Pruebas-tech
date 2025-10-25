package PruebaQA;

public class Usuario {
	private int id;
	private String nombre; 
	private String email;
	private String contrasena;
	
	// Constructor 
	public Usuario( String nombre, String email, String contrasena) {
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getEmail() {
		return email;
	}
	public String getcontrasena() {
		return contrasena;
	}
}
