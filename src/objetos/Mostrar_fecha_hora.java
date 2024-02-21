package objetos;

import java.util.Date;

import utilidades.Entrada;

public class Mostrar_fecha_hora {

	public static void main(String[] args) {
		Date fecha= new Date();
		int dias;
		do {
			System.out.println(fecha);
			
			dias=Entrada.entero("Días: ", "Error, número de días debe ser un número entero");
			
			fecha.setTime(fecha.getTime()+24*3600*1000*dias);
			
		} while (true);
	}

}
