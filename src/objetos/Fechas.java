package objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import utilidades.Entrada;
import utilidades.StdDraw;

public class Fechas {

	public static void main(String[] args) {
		Date fecha= new Date();
		long l=System.currentTimeMillis();
		System.out.println(fecha);
		System.out.println(l);
		System.out.println(fecha.getTime());
		fecha.setTime(0);
		System.out.println(fecha.getTime());
		
		System.out.println(fecha);
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		System.out.println(sdf.format(fecha));
		System.out.println("//////////////////////////////////////////////////////");
		
		SimpleDateFormat sdf3= new SimpleDateFormat("EEEE");
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy");
		sdf2.setLenient(false);
		boolean c=true;
		do {
			
			try {
				System.out.print("Introduzca una fecha: ");
				fecha=sdf2.parse(Entrada.cadena());
				c=false;
			} catch (ParseException e) {
				System.out.println("Error, fecha incorrecta");
			}
			
		} while (c);
		
		System.out.println("Esa fecha corresponde a un: "+sdf3.format(fecha));
		
		
		
	}

}
