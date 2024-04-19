package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		System.out.print("Ingrese su nombre: ");
		String nombre= sc.nextLine();
		System.out.print("Ingrese su Fecha de Nacimiento (dia: ) ");
		int dia = sc.nextInt();
		System.out.print("Ingrese Mes: ");
		int mes = sc.nextInt();
		System.out.print("Ingrese Año: ");
		int año = sc.nextInt();
		
		calendar.set(año, mes-1, dia);

		Persona persona = new Persona(nombre, calendar);
		
		persona.mostrarDatos();
		sc.close();
	}
}
