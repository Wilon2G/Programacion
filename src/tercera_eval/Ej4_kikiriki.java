package tercera_eval;

import utilidades.Entrada;
import utilidades.StdDraw;

public class Ej4_kikiriki {

	public static void main(String[] args) {
		boolean c= true;
		int min,seg;
		do {
			min=Entrada.entero("Introduzca los minutos: ", "Error, los minutos deben ser un número entero");
			seg=Entrada.entero("Introduzca los segundos: ", "Error, los segundos deben ser números enteros");
			if (min>=0&&seg>=0) {
				c=false;
			}
			else {
				System.out.println("Los minutos y segundos deben ser mayores o iguales que cero");
			}
			
		} while (c);
		System.out.println("");
		
		seg=seg+min*60;
		
		String salida="";
		
		while (seg>=0) {
			salida=formatearSegundos(seg);
			System.out.println(salida);
			seg--;
			
			StdDraw.pause(1000);
		}
		System.out.println("");
		System.out.println("Kikiriki");
		
	}

	private static String formatearSegundos(int seg) {
		if (seg<0) {
			throw new IllegalArgumentException("Error, los segundos no deben ser negativos: "+seg);
		}
		int min=0;
		while (seg>=60) {
			min ++;
			seg=seg-60;
		}
		
		return String.format("%02d:%02d", min, seg);
	}

}
