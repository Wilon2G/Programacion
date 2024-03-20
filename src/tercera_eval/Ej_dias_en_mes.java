package tercera_eval;

import utilidades.Entrada;

public class Ej_dias_en_mes {

	public static void main(String[] args) {
		int n = diasMes(Entrada.entero("Introduzca el numero de mes: ", "Error, debe introducir un número"), Entrada.entero("Introduzca el año: ", "Error, debe introducir un número"));
		System.out.println("Hay "+n+" días");
	}

	private static int diasMes(int mes, int year) {
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("Error, el mes introducido es incorrecto, debe estar entre 1 y 12");
		}
		int dias_mes=0;
		
		switch (mes) {
		case 1:
			dias_mes=31;
			break;
		case 2:
			if (bisiesto(year)) {
				dias_mes=29;
			}
			else {
				dias_mes=28;
			}
			
			break;
		case 3:
			dias_mes=31;
			break;
		case 4:
			dias_mes=30;
			break;
		case 5:
			dias_mes=31;
			break;
		case 6:
			dias_mes=30;
			break;
		case 7:
			dias_mes=31;
			break;
		case 8:
			dias_mes=31;
			break;
		case 9:
			dias_mes=30;
			break;
		case 10:
			dias_mes=31;
			break;
		case 11:
			dias_mes=30;
			break;
		case 12:
			dias_mes=31;
			break;

		}

		return dias_mes;
	}

	private static boolean bisiesto(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

}
