package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		Producto prod = new Producto ();
		
		for(int i=1;i<=3;i++) 
		{
			System.out.print("Ingrese nombre: ");
			prod.setNombre(sc.nextLine());
			System.out.print("Ingrese Codigo: ");
			prod.setCodigo(sc.nextInt());
			System.out.print("Ingrese Precio: ");
			prod.setPrecio(sc.nextInt());
			System.out.print("Ingrese Descuento: ");
			int descuento= sc.nextInt();
			if(descuento>=0 && descuento<= 50)
				prod.setDescuento(descuento);
			else	
				System.out.println("Valor de descuento erroneo");
			sc.nextLine();
			prod.mostrarDatos();
		}
	}
}