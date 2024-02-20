package algoritmos;

import utilidades.Entrada;

public class Ejercicio022 {

	public static void main(String[] args) {
		int dia,mes,año;
		while (true) {
			
			do {
				
				System.out.println("Introduzca año");
				año=Entrada.entero();
				if (año>2023) {
					System.out.println("Error, no se permiten viajeros temporales");
					System.out.println("");
				}
				if (año<0) {
					System.out.println("Error, introduzca un año positivo");
					System.out.println("");
				}
				if (año==0) {
					System.out.println("Bienvenido General Augusto");
					System.out.println("");
				}
				
			} while (año>2023||año<0);
			
			do {
				System.out.println("Introduzca mes de nacimiento");
				mes=Entrada.entero();
				if (mes<=0||mes>12) {
					System.out.println("Error, existen doce meses en un año");
					System.out.println("");
				}
			} while (mes<=0||mes>12);
			//1=31  2=29  3=31  4=30  5=31  6=30  7=31  8=31  9=30  10=31  11=30  12=31
			
			switch (mes) {
			case 1:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>31) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else{System.out.println(dia+" de Enero de "+año);}
					
				} while (dia<0||dia>31);
				
				break;
				
			case 2:	
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>29) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Febrero de "+año);
					}
					
				} while (dia<0||dia>29);
				
				break;
				
			case 3:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>31) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Marzo de "+año);
					}
					
				} while (dia<0||dia>31);
				break;
				
			case 4:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>30) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Abril de "+año);
					}
					
				} while (dia<0||dia>30);
				break;
				
			case 5:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>31) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Mayo de "+año);
					}
					
				} while (dia<0||dia>31);
				break;
				
			case 6:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>30) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Junio de "+año);
					}
					
				} while (dia<0||dia>30);
				break;
			case 7:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>31) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Julio de "+año);
					}
					
				} while (dia<0||dia>31);
				break;
			case 8:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>31) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Agosto de "+año);
					}
					
				} while (dia<0||dia>31);
				break;
			case 9:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>30) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Septiembre de "+año);
					}
					
				} while (dia<0||dia>30);
				break;
				
			case 10:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>31) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Octubre de "+año);
					}
					
				} while (dia<0||dia>31);
				break;
				
			case 11:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>30) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Noviembre de "+año);
					}
					
				} while (dia<0||dia>30);
				break;
				
			case 12:
				do {

					System.out.println("Introduzca día");
					dia=Entrada.entero();
					if (dia<1||dia>31) {
						System.out.println("Error, el día debe ser parte del mes");
					}
					else {
						System.out.println(dia+" de Diciembre de "+año);
					}
					
				} while (dia<0||dia>31);
				break;
				
			default:
				break;
			}
			
	
			
			
			
			
		}
	}

}
