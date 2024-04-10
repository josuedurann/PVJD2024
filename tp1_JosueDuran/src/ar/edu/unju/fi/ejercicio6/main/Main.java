package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Persona 1");
		
		Persona persona1 = new Persona();
		
		System.out.print("Ingrese Nombre: ");
		persona1.setNombre(teclado.nextLine());
		
		System.out.print("Ingrese numero de DNI: ");
		persona1.setDni(teclado.nextInt());
		teclado.nextLine();
		
		System.out.print("Ingrese provincia donde nacio: ");
		persona1.setProvincia(teclado.nextLine());
		
		System.out.print("Ingrese año de nacimiento: ");
		int año = teclado.nextInt();
		
		System.out.print("Ingrese mes de nacimiento: ");
		int mes = teclado.nextInt();
		
		System.out.print("Ingrese dia de nacimiento: ");
		int dia = teclado.nextInt();
		
		persona1.setFechanac(LocalDate.of(año, mes, dia));
		
		persona1.mostrarDatos();
		
		System.out.println("Persona 2");
		
		Persona persona2 = new Persona(45767542, "Ricardo", LocalDate.of(2004, 04, 21), "Jujuy");
		System.out.print("Ingrese Nombre: ");
		persona2.setNombre(teclado.nextLine());
		
		System.out.print("Ingrese numero de DNI: ");
		persona2.setDni(teclado.nextInt());
		teclado.nextLine();
		
		System.out.print("Ingrese provincia donde nacio: ");
		persona2.setProvincia(teclado.nextLine());
		
		System.out.print("Ingrese año de nacimiento: ");
		 año = teclado.nextInt();
		
		System.out.print("Ingrese mes de nacimiento: ");
		 mes = teclado.nextInt();
		
		System.out.print("Ingrese dia de nacimiento: ");
		 dia = teclado.nextInt();
		
		persona2.setFechanac(LocalDate.of(año, mes, dia));
		persona2.mostrarDatos();
		
		System.out.println("Persona 3");
		
		Persona persona3 = new Persona(45327596, "Josue", LocalDate.of(2003, 11, 20));
		
		System.out.print("Ingrese Nombre: ");
		persona3.setNombre(teclado.nextLine());
		
		System.out.print("Ingrese numero de DNI: ");
		persona3.setDni(teclado.nextInt());
		teclado.nextLine();
		
		System.out.print("Ingrese provincia donde nacio: ");
		persona3.setProvincia(teclado.nextLine());
		
		System.out.print("Ingrese año de nacimiento: ");
		 año = teclado.nextInt();
		
		System.out.print("Ingrese mes de nacimiento: ");
		 mes = teclado.nextInt();
		
		System.out.print("Ingrese dia de nacimiento: ");
		 dia = teclado.nextInt();
		
		persona3.setFechanac(LocalDate.of(año, mes, dia));
		persona3.mostrarDatos();
	}

}
