package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private LocalDate fechanac;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;
	
	public Jugador() {
	}

	public void altaJugador() {
		Scanner sc = new Scanner(System.in);
		boolean error=false;
		System.out.print("Ingrese su nombre: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese su apellido: ");
		apellido=sc.nextLine();
		do {
		try {
			error=false;
			System.out.println("Ingrese su Fecha de Nacimiento (dd/mm/yyyy): ");
			fechanac= LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			sc.nextLine();
		} catch ( DateTimeParseException e) {
			System.out.println("Fecha mal ingresada");
			error=true;
		}
		}while(error);
		System.out.println("Ingrese su Nacionalidad: ");
		nacionalidad= sc.nextLine();
		System.out.print("Ingrese su Estatura: ");
		estatura= sc.nextDouble();
		System.out.print("Ingrese su peso: ");
		peso=sc.nextDouble();
		sc.nextLine();
		System.out.print("Ingrese su posicion (Delantero, Mediocampista, Defensor, Arquero): ");
		posicion=sc.nextLine();
	}
	
	public int calcularEdad() {
		Period period = Period.between(fechanac, LocalDate.now());
		return period.getYears();
	}
	
	public void mostrarDatos() {
		System.out.println("");
		System.out.println("Nombre:"+ nombre);
		System.out.println("Apellido:"+ apellido);
		System.out.println("Fecha de Nacimiento:"+ fechanac);
		System.out.println("Nacionalidad:"+ nacionalidad);
		System.out.println("Estatura:"+ estatura);
		System.out.println("Peso:"+ peso);
		System.out.println("Posicion:"+ posicion);
		System.out.println("");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}