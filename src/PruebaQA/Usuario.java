package PruebaQA;

public class Usuario {
	private int id;
	private String nombre; 
	private String email;
	private String contrasena;
	
	// Constructor  con parametros 
	public Usuario(int id,  String nombre, String email, String contrasena) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
	}
	
	//Metodos Getters y Setters 
	public int getid() {
		return id;
	}
	public void Setid(int id) {
		this.id = id;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getcontrasena() {
		return contrasena;
	}
	
	public void Setcontrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
