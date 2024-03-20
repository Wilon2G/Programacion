package tercera_eval;

import java.awt.Color;
import java.awt.Font;

import utilidades.Entrada;
import utilidades.StdAudio;
import utilidades.StdDraw;

public class Ej4_Digital {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		Font f=new Font("Arial",0,30);
		StdDraw.setFont(f);
		
		boolean c = true;
		int min, seg;
		do {
			min = Entrada.entero("Introduzca los minutos: ", "Error, los minutos deben ser un número entero");
			seg = Entrada.entero("Introduzca los segundos: ", "Error, los segundos deben ser números enteros");
			if (min >= 0 && seg >= 0) {
				c = false;
			} else {
				System.out.println("Los minutos y segundos deben ser mayores o iguales que cero");
			}

		} while (c);
		
		seg = seg + min * 60;

		String salida = "";
		
		StdDraw.enableDoubleBuffering();
		while (seg >= 0) {
			StdDraw.clear(Color.black);
			
			salida = formatearSegundos(seg);
			StdDraw.setPenColor(Color.red);
			StdDraw.text(0, 0, salida);
			seg--;
			
			StdDraw.show();
			StdDraw.pause(1000);
		}
		StdDraw.clear(Color.black);
		StdDraw.text(0,0,"kikiriki");
		StdAudio.playInBackground("media/gallo.wav");
		StdDraw.show();
		
	}

	private static String formatearSegundos(int seg) {
		if (seg < 0) {
			throw new IllegalArgumentException("Error, los segundos no deben ser negativos: " + seg);
		}
		int min = seg/60;
		seg=seg%60;

		return String.format("%02d:%02d", min, seg);
	}

}
