package tercera_eval;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import utilidades.Entrada;

public class Fecha_nacimiento_años {

	public static void main(String[] args) {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat anyo= new SimpleDateFormat("dd");
		SimpleDateFormat mes= new SimpleDateFormat("MM");
		SimpleDateFormat dia= new SimpleDateFormat("yyyy");
		boolean c=true;
		Date fechaNacimiento= new Date();
		Date fechaActual=new Date();
		do {
			
			try {
				System.out.print("Introduzca su fecha de nacimiento: ");
				fechaNacimiento=sdf.parse(Entrada.cadena());
				c=false;
			} catch (ParseException e) {
				System.out.println("Error, fromato de fecha incorrecto, debe ser dd/mm/yyy");
			}
			
		} while (c);
		
		
	}

}
