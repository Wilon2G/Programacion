package algoritmos;

import utilidades.Entrada;

public class Ejercicio012a {

	public static void main(String[] args) {
		int n,posible,cont;
		boolean primo;
		while (true) {
			do {
				System.out.println("Introduzca el número de primos que desee:");
				n=Entrada.entero();
				if (n<=0) {
					System.out.println("Error, el número debe ser mayor que cero");
					System.out.println(" ");
				}
			} while (n<=0);
			System.out.println(n+" Números primos son:");
			cont=0;
			posible=2;
			while (cont<n) {
				primo=true;
				for (int i = 2; i < posible-1; i++) {
					if (posible%i==0) {
						primo=false;
					}
				}
				if (primo) {
					System.out.print(posible+" ");
					cont=cont+1;
				}
				posible=posible+1;
			}
			System.out.println(" ");
			System.out.println(" ");
		}		
	}

}
