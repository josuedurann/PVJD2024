package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numero;
		int suma = 0;
		int max;
		do{
		System.out.println("Ingrese numero entre 3 y 10: ");
		max = teclado.nextInt();
		}while(max<3 || max>10);
		numero = new int[max];
		
		for(int i=0;i<max;i++)
		{
			System.out.println("Ingrese valor en la posicion: "+i);
			numero[i] = teclado.nextInt();
			suma = numero[i] + suma;
		}
		for(int i=0;i<max;i++)
		{	
			System.out.println("Array "+i+" = " +numero[i]);
		}
		System.out.println("Suma: "+suma);
	}

}
