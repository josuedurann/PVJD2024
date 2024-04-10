package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a factorizar en un rango de 0 a 10: ");
		
		int factorial = teclado.nextInt();
		
		int resultado = 1;
		while(factorial>0 && factorial<=10){
			
		resultado = resultado*factorial;
		factorial--;
		
		}
		System.out.println("Resultado: " +resultado);
		
	

	}

}
