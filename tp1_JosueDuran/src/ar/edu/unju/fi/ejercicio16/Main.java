package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nombre;
		nombre = new String[5];
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Ingrese nombre en la posicion: "+i);
			nombre[i] = teclado.next();
		}
		i=0;
		while(i<5){
			System.out.println("Nombres: "+nombre[i]);
			i++;
		}
		System.out.println("Tamaño: "+nombre.length);
		byte nashe;
		do {
		System.out.println("Ingrese un byte: ");
		nashe = teclado.nextByte(); 
		}while(nashe>=5);
		
		while(nashe<4)
		{
			nombre[nashe] = nombre[nashe+1];
			nashe++;
		}
		nombre[4]=""; 
		for(i=0;i<4;i++)
		{
			System.out.println("Nombre: "+nombre[i]);
		}
	}
		

}
