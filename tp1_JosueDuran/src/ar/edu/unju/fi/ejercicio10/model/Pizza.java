package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private int diametro;
	private int precio;
	private double area ;
	private boolean especiales;
	private final int ingesp20=500;
	private final int ingesp30=750;
	private final int ingesp40=1000;
	
	public Pizza() {
		
	}
	
	public void calcularPrecio () {
		
		
		if(diametro <= 20)
		{
			precio=4500;
			if (especiales)
				precio= precio + ingesp20;
		}
		else
			if(diametro <= 30)
			{
				precio=4800;
				if (especiales)
					precio= precio + ingesp30;
			}
			else
				if(diametro <= 40)
				{
					precio=5500;
					if (especiales)
						precio= precio + ingesp40;
				}

	}
	
	public void calcularArea() {
		area= Math.PI * Math.pow(diametro/2, 2);
	}
	
	public void mostrarDatos() {
		System.out.println("Diametro= "+ diametro );
		System.out.println("Ingredientes especiales= "+ especiales);
		System.out.println("Precio de Pizza= "+ precio+"$"  );
		System.out.println("Area de la Pizza= "+ area);
	}
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isEspeciales() {
		return especiales;
	}
	public void setEspeciales(boolean especiales) {
		this.especiales = especiales;
	}
	public int getIngesp20() {
		return ingesp20;
	}
	public int getIngesp30() {
		return ingesp30;
	}
	public int getIngesp40() {
		return ingesp40;
	}
	
}
