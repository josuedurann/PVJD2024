package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pizza piza = new Pizza();
		
		
		for(int i=1;i<=3;i++) 
		{
			System.out.print("Ingrese Diametro: ");
			piza.setDiametro(sc.nextInt());
			sc.nextLine();
			System.out.print("¿Tiene Ingredientes especiales? (True o False): ");
			piza.setEspeciales(sc.nextBoolean());
			piza.calcularPrecio();
			piza.calcularArea();
			piza.mostrarDatos();
			
		}
	}

}
