package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a multiplicar: ");
		
		int numero = teclado.nextInt();
		int resultado = 0;
		for(int i = 0; i <=10;i++){
			
		resultado = numero*i;
		
		System.out.println(numero+" x "+i+" = "+resultado);
		
		
		}

	}

}
