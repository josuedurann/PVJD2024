package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		System.out.println("Ingrese numero: ");
		calculadora.setN(teclado.nextInt());
		System.out.println(calculadora.calcularSumatoria());
		
		
		System.out.println(calculadora.calcularProductoria());
	}

}
