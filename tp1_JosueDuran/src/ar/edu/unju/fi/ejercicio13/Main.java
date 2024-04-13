package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	int[] numero;
	numero = new int[8];
	
	Scanner teclado = new Scanner(System.in);
	
	for(int i=0;i<numero.length;i++)
	{
		System.out.println("Ingrese numero entero: ");
		numero[i] = teclado.nextInt();
	}
	for(int i=0;i<numero.length;i++)
	{
		System.out.println("Contenido "+numero[i]+" posicion "+i);
	}
	}
}
