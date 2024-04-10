package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private int legajo;
	private float salario;
	
	final float salariomin = 210000;
	final float aumento = 20000;
	
	public Empleado(String nombre, int legajo, float salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= this.salariomin)	
		this.salario = salario;
		else
		this.salario = salariomin;
	}
	
	public void mostrarDatos() {
		
		System.out.println("Nombre del Empleado: " +nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario $: "+salario);
		
	}
	public void aumentoSalario() {
		salario += aumento;
		System.out.println("Salario aumentado por meritos");
	}
}
