package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String empleado;
        int legajo;
		float salario;
		
		
		System.out.println("Ingrese Nombre del Nuevo Empleado: ");
		empleado = teclado.nextLine();
		
		System.out.println("Ingrese Numero de Legajo: ");
		legajo = teclado.nextInt();
		
		System.out.println("Ingrese Salario: ");
		salario = teclado.nextFloat();
		
		Empleado persona = new Empleado(empleado, legajo, salario);
		
		persona.mostrarDatos();
		
		persona.aumentoSalario();
		
		persona.mostrarDatos();
		
		
		

	}

}
