package algoritmos;

import utilidades.Entrada;

public class Ejercicio012 {

	public static void main(String[] args) {
		int n;
		boolean primo;
		while (true) {
			do {
				System.out.println("Introduzca un número");
				n=Entrada.entero();
				if (n<=1) {
					System.out.println("Error, el número debe ser mayor que uno");
					System.out.println(" ");
				}
			} while (n<=1);
			primo=true;
			for (int i = 2; i < n-1; i++) {
				if (n%i==0) {
					primo=false;
				}
			}
			if (primo) {
				System.out.println(n+" Es primo");
			}
			else {System.out.println(n+" No es primo");}
		}

	}

}
