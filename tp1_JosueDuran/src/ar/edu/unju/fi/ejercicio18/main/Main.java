package ar.edu.unju.fi.ejercicio18.main;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Pais> paises = new ArrayList(); 
		List<DestinoTuristico> destinos = new ArrayList();
		
		int op;
		paises.add(new Pais("arg","argentina"));
		paises.add(new Pais("bra","brasil"));
		paises.add(new Pais("usa","estados unidos"));
		do {
		System.out.println("------------------------");
		System.out.println("1- Alta de Destino Turistico.");
		System.out.println("2- Mostrar Todos los Destinos Turisticos."); 
		System.out.println("3- Modificar un Pais de un Destino Turistico.");
		System.out.println("4- Limpiar el Array List de Destinos Turisticos.");
		System.out.println("5- Eliminar un Destino Turistico ");
		System.out.println("6- Mostrar los Destinos Turisticos Ordenados por Nombre.");
		System.out.println("7- Mostrar todos los Paises.");
		System.out.println("8- Mostrar los Destinos Turisticos que pertenecen a un pais.");
		System.out.println("9- Salir.");
		System.out.println("Ingrese Opcion: "); 
		op= sc.nextInt();
		switch(op) 
		{
			case 1: DestinoTuristico dt = new DestinoTuristico();
					dt.altaDt(paises);
					destinos.add(dt);
					break;
			case 2: mostrarTodo(destinos);
					break;
			case 3: modDestino(destinos,paises);
					break;
			case 4: limpiarDt(destinos); 
					break;
			case 5: eliminar(destinos);
					break;
			case 6: mostrarOrden(destinos);
					break;
			case 7: mostrarPaises(paises);
					break;
			case 8: mostrarDtdePais(destinos);
				    break;
					
			default :
		 }

		}while(op!=9); 
		
	}
	public static void mostrarTodo(List<DestinoTuristico> destinos) {

		for(DestinoTuristico d: destinos)
			d.mostrarDatos();
	}
public static void modDestino(List<DestinoTuristico> destinos, List<Pais> paises) {
		
		Scanner sc = new Scanner(System.in);
		int codigo;
		System.out.print("Ingrese Codigo: ");
		codigo=sc.nextInt();
		for(DestinoTuristico d: destinos) {
			if(d.getCodigo() == codigo)
				d.altaDt(paises);
		}
	}
public static void limpiarDt(List<DestinoTuristico> destinos)
{
	
	while(destinos.size()!=0)
		destinos.remove(0);
	
}
public static void eliminar (List<DestinoTuristico> destinos) {
	
	Scanner sc = new Scanner(System.in);
	int codigo;
	
	Boolean borrado=false;
	System.out.print("Ingrese codigo del destino: ");
	codigo=sc.nextInt();
	
	for(DestinoTuristico d: destinos) 
	if(d.getCodigo() == codigo)
			borrado=destinos.remove(d);
	if (borrado)
		System.out.println("Destino eliminado");
	else 
		System.out.println("Destino no encontrado");
}
public static void mostrarOrden(List<DestinoTuristico> destinos) {
	destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
	for(DestinoTuristico d: destinos)
		d.mostrarDatos();
}
public static void mostrarPaises(List<Pais> paises) {

	for(Pais p: paises) {
		System.out.println("Pais:"+p.getNombre());
	    System.out.println("Codigo del Pais:" +p.getCodigo());}
}
public static void mostrarDtdePais(List<DestinoTuristico> destinos) {
	
	Scanner sc = new Scanner(System.in);
	String codigo;
	System.out.print("Ingrese Codigo de Pais: ");
	codigo=sc.nextLine();
	for(DestinoTuristico d: destinos) {
		if(d.getPais().getCodigo().equals(codigo))
			d.mostrarDatos();;
	}
}
}

