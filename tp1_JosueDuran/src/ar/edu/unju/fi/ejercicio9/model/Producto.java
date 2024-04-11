package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;
	
	public Producto () {
		
	}
	
	public double calcularDescuento() {
		
		precio = precio - precio * descuento /100;
		
		return precio;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Codigo: "+ codigo);
		System.out.println("Precio: "+ precio);
		System.out.println("Descuento: %"+ descuento);
		System.out.println("Precio con su descuento: "+ this.calcularDescuento());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
}