package algoritmos;

import utilidades.Entrada;

public class Ejercicio026 {

	public static void main(String[] args) {
		int n;
		while (true) {
			System.out.println("Introduzca su nota:");
			n = Entrada.entero();
			switch (n) {
			case 0, 1, 2, 3, 4:
				System.out.println("Suspenso");
				break;
			case 5, 6:
				System.out.println("Bien");
				break;
			case 8, 7:
				System.out.println("Notable");
				break;
			case 9, 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Error, introduzca una calificación comprendida entre 0 y 10");
				break;
			}
		}

	}

}
