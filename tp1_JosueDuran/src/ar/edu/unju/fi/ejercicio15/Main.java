package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nombre;
		int max;
	
		do {
		System.out.println("Ingrese numero entre 5 y 10: ");
		max = teclado.nextInt();
		}while(max<5 || max>10);
		nombre = new String[max];
		teclado.nextLine();
		for(int i=0;i<max;i++)
		{
			System.out.println("Ingrese nombre en la posicion: "+i);
			nombre[i] = teclado.next();
		}
		for(int i=0;i<max;i++)
		{	
			System.out.println("Nombre "+i+" = " +nombre[i]);
		}
		System.out.println();
		for(int i=max-1;i>=0;i--)
		{	
			System.out.println("Nombre "+i+" = " +nombre[i]);
		}
	}

}
