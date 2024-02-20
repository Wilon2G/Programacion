package algoritmos;

import utilidades.Entrada;

public class Ejercicio015 {

	public static void main(String[] args) {
		int n;
		while (true) {
			
			n=0;
			do {
				if (n<0) {
					System.out.println("Error, introduzca un número positivo");
				}
				else {
					System.out.println("Introduzca un número:");
				}
				n=Entrada.entero();
				
			} while (n<0);
			System.out.println("La tabla del "+n+" es:");
			for (int i = 0; i <= 10; i++) {
				System.out.println(i+" x "+n+" = "+n*i);
			}
			
		}
		
	}

}
