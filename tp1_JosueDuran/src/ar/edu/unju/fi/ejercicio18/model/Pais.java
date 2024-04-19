package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	
	private String Codigo;
	private String nombre;
	
	
	
	
	
	
	
	
	
	public Pais(String codigo, String nombre) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
