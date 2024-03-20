package objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import utilidades.Entrada;

public class Mostrar_fecha_hora {

	public static void main(String[] args) {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date fecha= new Date();
		int dias;
		boolean c=true;
		do {
			try {
				System.out.print("Introduzca la fecha de inicio: ");
				fecha=sdf.parse(Entrada.cadena());
				c=false;
			} catch (ParseException e) {
				System.out.println("Error, fecha incorrecta");
			}
			
		} while (c);
		do {
			System.out.println(sdf.format(fecha));
			
		
			dias=Entrada.entero("Introduzca lo días que quiere viajar al pasado o futuro: ", "Error, número de días debe ser un número entero");
			
			fecha.setTime(fecha.getTime()+24*3600*1000*dias);
			
		} while (true);
	}

}
