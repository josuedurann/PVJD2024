package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String Nombre;
	private Calendar FechaNac;

	public Persona(String nombre, Calendar fechaNac) {
		super();
		Nombre = nombre;
		FechaNac = fechaNac;
	}

	public int calcular_Edad(){	
	return Calendar.getInstance().get(Calendar.YEAR)- FechaNac.get(Calendar.YEAR);
	}
	
	public String signozod(){
		
		int dia=FechaNac.get(Calendar.DAY_OF_MONTH);
		int mes=FechaNac.get(Calendar.MONTH)+1;
		
		if(dia >= 21 && mes==3 || dia<= 19 && mes==4)
			return "Aries";
		else if(dia >= 20 && mes==4 || dia<= 20 && mes==5)
			return "Tauro";
		else if(dia >= 21 && mes==5 || dia<= 20 && mes==6)
			return "Geminis";
		else if(dia >= 21 && mes==6 || dia<= 22 && mes==7)
			return "Cancer";
		else if(dia >= 23 && mes==7 || dia<= 22 && mes==8)
			return "Leo";
		else if(dia >= 23 && mes==8 || dia<= 22 && mes==9)
			return "Virgo";
		else if(dia >= 23 && mes==9 || dia<= 22 && mes==10)
			return "Libra";
		else if(dia >= 23 && mes==10 || dia<= 21 && mes==11)
			return "Escorpio";
		else if(dia >= 22 && mes==11 || dia<= 21 && mes==12)
			return "Sagitario";
		else if(dia >= 22 && mes==12 || dia<= 19 && mes==1)
			return "Capricornio";
		else if(dia >= 20 && mes==1 || dia<= 18 && mes==2)
			return "Acuario";
		else if(dia >= 19 && mes==2 || dia<= 20 && mes==3)
			return "Piscis";
		return "...";
	}
	
	public String estacion_nac() {
		int dia=FechaNac.get(Calendar.DAY_OF_MONTH);
		int mes=FechaNac.get(Calendar.MONTH)+1;
		
		if(dia>=21 && mes==12 || dia<=20 && mes <=3 || mes <=2)
			return "Verano";
		else if(dia>=21 && mes==3 || dia<=20 && mes==6 || mes<=5)
			return "Otoño";
		else if(dia>=21 && mes==6 || dia<=20 && mes ==9  || mes <=8)
			return "Invierno";
		else if(dia>=21 && mes==9 || dia<=20 && mes ==12  || mes <=11)
			return "Primavera";
		return ".....";
	}
	
	public void mostrarDatos () {
		System.out.println("Nombre: " + Nombre);
		System.out.println("Fecha de Nacimiento: " + FechaNac.get(Calendar.DAY_OF_MONTH) + "/" + FechaNac.get(Calendar.MONTH)+ "/" + FechaNac.get(Calendar.YEAR));
		System.out.println("Edad: "+this.calcular_Edad()+" años");
		System.out.println("Signo del zodiaco: "+this.signozod());
		System.out.println("Estacion: "+this.estacion_nac());
	}
}



