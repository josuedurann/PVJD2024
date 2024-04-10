package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero = cin.nextInt();
		
		if(numero % 2 == 0) 
			System.out.println("Numero por 3: " +numero*3);
		else
			System.out.println("Numero por 2: " +numero*2);
		
		

	}

}
