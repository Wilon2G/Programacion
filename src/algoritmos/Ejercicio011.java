package algoritmos;

import utilidades.Entrada;

public class Ejercicio011 {

	public static void main(String[] args) {
		int n;
		while (true) {
			System.out.println("¿Cuántos múltiplos de cuatro desea?");
			n=Entrada.entero();
			System.out.println(n+" Mútiplos de 4 son:");
			for (int i = 1; i <= n; i++) {
				System.out.print(i*4+" ");
			}
			System.out.println(" ");
			System.out.println(" ");
		}
	}

}
