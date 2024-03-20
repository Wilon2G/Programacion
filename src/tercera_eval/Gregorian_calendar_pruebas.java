package tercera_eval;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import utilidades.Entrada;

public class Gregorian_calendar_pruebas {

	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		boolean c=true;
		String unidades;
		int des=0;
		do {
			GregorianCalendar gc=new GregorianCalendar();
			do {
				
				System.out.println("Tiempo actual: "+gc.getTime());
				
				System.out.print("Unidades? [a-años d-días h-horas m-minutos s-segundos]: ");
				unidades=Entrada.cadena();
				unidades.toLowerCase();
				if (unidades.matches("[adhs]")||unidades.matches("min")||unidades.matches("ms")) {
					c=false;
					des=Entrada.entero("Introduzca el desplazamiento: ", "Error, el desplazamiento debe ser un número entero");
				}
				else {
					System.out.println("Error, las opciones son: [a-años d-días h-horas m-minutos s-segundos]");
				}
			} while (c);
			
			GregorianCalendar gc2=desplazarTiempo(gc,des,unidades);
			Date d=gc2.getTime();
			System.out.println(sdf.format(d));
			System.out.println("");
		} while (true);
		
		
	}

	private static GregorianCalendar desplazarTiempo(GregorianCalendar gc, int des, String unidades) {
		GregorianCalendar gc2=gc;
		switch (unidades) {
		case "a":
			gc2.add(Calendar.YEAR, des);
			break;
		case "d":
			gc2.add(Calendar.DAY_OF_MONTH, des);
			break;
		case "h":
			gc2.add(Calendar.HOUR, des);
			break;
		case "min":
			gc2.add(Calendar.MINUTE, des);
			break;
		case "s":
			gc2.add(Calendar.SECOND, des);
			break;
		case "ms":
			gc2.add(Calendar.MILLISECOND, des);
			break;

		}
		
		return gc2;
	}

}
