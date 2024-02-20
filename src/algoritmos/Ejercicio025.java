package algoritmos;

import utilidades.Entrada;

public class Ejercicio025 {

	public static void main(String[] args) {
		int l, a;
		boolean correcto;
		while (true) {
			do {
				System.out.println("Introduzca la longitud:");
				l=Entrada.entero();
				correcto=l>0;
				if (!correcto) {
					System.out.println("Error, la longitud debe ser positiva");
				}
			} while (!correcto);
			do {
				System.out.println("Introduzca la anchura:");
				a=Entrada.entero();
				correcto=a>0;
				if (!correcto) {
					System.out.println("Error, la anchura debe ser positiva");
				}
			} while (!correcto);
			System.out.println("El perímetro del cuarto es: "+((a*2)+(l*2)));
			
			System.out.println("El área del cuerto es: "+a*l);
			
		}
	}

}
