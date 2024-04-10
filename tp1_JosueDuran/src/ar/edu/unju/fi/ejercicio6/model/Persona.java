package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {

	private int dni;
	private String nombre;
	private LocalDate fechanac;
	private String provincia;
	
	public Persona() {
		
	}
	
	public Persona(int dni, String nombre, LocalDate fechanac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.provincia = provincia;
	}
	public Persona(int dni, String nombre, LocalDate fechanac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.provincia = "Jujuy";
	}

	public int getDni() {
	return dni;
	}
	public void setDni(int dni) {
	this.dni = dni;
	}
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	public LocalDate getFechanac() {
	return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
	this.fechanac = fechanac;
	}
	public String getProvincia() {
	return provincia;
	}
	public void setProvincia(String provincia) {
	this.provincia = provincia;
	}
	
	public int calcularedad() {
		return LocalDate.now().getYear()-fechanac.getYear();
	}
	public boolean verifedad() {
		return  this.calcularedad()>=18;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " +nombre);
		System.out.println("DNI: " +dni);
		System.out.println("Fecha de Nacimiento: " +fechanac);
		System.out.println("Provincia: " +provincia);
		System.out.println("Edad: " +this.calcularedad());
		if(this.verifedad())
			System.out.println("La persona es mayor de edad");
		else
			System.out.println("La persona no es mayor de edad");
	}
	}
