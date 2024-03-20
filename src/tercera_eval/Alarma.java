package tercera_eval;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import utilidades.Entrada;
import utilidades.StdAudio;
import utilidades.StdDraw;

public class Alarma {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		Font f=new Font("Arial",0,30);
		StdDraw.setFont(f);
		int hora = 0;
		int min =0;
		boolean c=true;
		do {
			hora=Entrada.entero("Introduzca la hora: ", "Error, la hora debe ser un número entero");
			min=Entrada.entero("Introduzca los minutos: ", "Error, los minutos deben ser números enteros");
			if (hora>=0&&hora<=23&&min>=0&&min<=59) {
				c=false;
			}
			else {
				System.out.println("");
			}
			
		} while (c);
		
		
		int segRestante=hora*3600+min*60;
		
		GregorianCalendar gc=new GregorianCalendar();
		int segActual=gc.get(Calendar.HOUR_OF_DAY)*3600+gc.get(Calendar.MINUTE)*60+gc.get(Calendar.SECOND);
		
		if (segActual>segRestante) {
			segRestante=24*3600-segActual+segRestante;
		}
		else {
			segRestante=segRestante-segActual;
		}
		
		String salida = "";
		
		
		StdDraw.enableDoubleBuffering();
		while (segRestante>=0) {
			StdDraw.clear(Color.black);
			StdDraw.text(0, -20, "Hora actual: "+String.format("%02d:%02d",gc.get(Calendar.HOUR_OF_DAY) , gc.get(Calendar.MINUTE)));
			StdDraw.text(0, 20, "Alarma programada para: "+String.format("%02d:%02d", hora, min));
			salida = formatearSegundos(segRestante);
			StdDraw.setPenColor(Color.red);
			StdDraw.text(0, 0, "La alarma sonará en: "+salida);
			gc=new GregorianCalendar();
			StdDraw.show();
			StdDraw.pause(1000);
			segRestante--;
		}
		StdDraw.clear(Color.orange);
		StdDraw.setPenColor(Color.black);
		StdDraw.text(0, 0, "Rise and shine!!");
		StdAudio.playInBackground("media/gallo.wav");
		StdDraw.show();
		
	}

	private static String formatearSegundos(int t) {
		if (t < 0) {
			throw new IllegalArgumentException("Error, los segundos no deben ser negativos: " + t);
		}
		int min=0;
		while (t>=60) {
			min ++;
			t=t-60;
		}
		int hora=0;
		while (min>=60) {
			hora ++;
			min=min-60;
		}

		return String.format("%02d:%02d:%02d", hora, min,t);
		
	}

	

}
