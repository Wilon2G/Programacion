package algoritmos;

import utilidades.Entrada;

public class Ejercicio021 {

	public static void main(String[] args) {
		int n;
		while (true) {
			System.out.println("Introduzca un número");
			n=Entrada.entero();
			switch (n) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Error, introduzca un número del uno al siete");
				break;
			}
			System.out.println("");
			
		}
	}

}
