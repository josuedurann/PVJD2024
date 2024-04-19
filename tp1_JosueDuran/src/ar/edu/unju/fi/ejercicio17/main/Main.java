package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		List<Jugador>plantel = new ArrayList();
		Scanner sc = new Scanner(System.in);
		//Jugador jg = new Jugador();
		int op;
		String pausa;
		do {
		System.out.println("------------------------");
		System.out.println("1- Alta de Jugador");
		System.out.println("2- Mostrar los datos del jugador"); 
		System.out.println("3- Mostrar todos los jugadores ordenados por apellido.");
		System.out.println("4- Modificar los datos de un jugador");
		System.out.println("5- Eliminar un jugador ");
		System.out.println("6- Mostrar cantidad de jugadores que tiene el ArrayList");
		System.out.println("7- Mostrar la cantidad de Jugadores que pertenecen a una nacionalidad");
		System.out.println("8- Salir");
		System.out.println("Ingrese Opcion: "); 
		op= sc.nextInt();
		switch(op) 
		{
			case 1: Jugador jg = new Jugador();
					jg.altaJugador();
					plantel.add(jg);
					break;
			case 2: mostrarEsp(plantel);
					break;
			case 3: mostrarOrden(plantel);
					break;
			case 4: modJugador(plantel);
					break;
			case 5: eliminar(plantel);
					break;
			case 6: System.out.println("Cantidad de jugadores: "+ plantel.size());
					break;
			case 7: cantJugadNac(plantel);
					break;
			default :
		 }
		pausa=sc.nextLine();
		}while(op!=8);
		sc.close();
	}

	public static void mostrarEsp(List<Jugador> plantel) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.print("Ingrese el nombre de jugador: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese su apellido: ");
		apellido=sc.nextLine();
		for(Jugador j: plantel) {
			if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido))
				j.mostrarDatos();
		}		
	}
	
	public static void mostrarOrden(List<Jugador> plantel) {
		plantel.sort(Comparator.comparing(Jugador::getApellido));
		for(Jugador j: plantel)
			j.mostrarDatos();
	}
	
	public static void modJugador(List<Jugador> plantel) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.print("Ingrese el nombre de jugador: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese su apellido: ");
		apellido=sc.nextLine();
		for(Jugador j: plantel) {
			if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido))
				j.altaJugador();
		}
	}
	
	public static void eliminar (List<Jugador> plantel) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		Boolean borrado=false;
		System.out.print("Ingrese el nombre de jugador: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese su apellido: ");
		apellido=sc.nextLine();
		for(Jugador j: plantel) 
			if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido))
				borrado=plantel.remove(j);
		if (borrado)
			System.out.println("Jugador eliminado");
		else 
			System.out.println("Jugador no encontrado");
	}
	
	public static void cantJugadNac(List<Jugador> plantel) {
		
		Scanner sc = new Scanner(System.in);
		String nacionalidad;
		int i=0;
		System.out.print("Ingrese la nacionalidad de jugador: ");
		nacionalidad=sc.nextLine();
		for(Jugador j: plantel) {
			if(j.getNacionalidad().equals(nacionalidad))
			i++;
		}
		System.out.println("Cantidad de jugadores de "+nacionalidad+" son:"+i);
	}
	
	
}
