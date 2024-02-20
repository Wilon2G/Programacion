package algoritmos;

import utilidades.Entrada;

public class Ejercicio023 {

	public static void main(String[] args) {
		int n;
		String t;
		boolean correcto;
		while (true) {
			System.out.println("Introduzca cantidad:");
			n=Entrada.entero();
			
			do {
				System.out.println("¿Está en Centímetros o en Pulgadas?");
				t=Entrada.cadena();
				correcto=t.equalsIgnoreCase("c")||t.equalsIgnoreCase("p");
				if (!correcto) {
					System.out.println("Error, las opciones son c y p");
				}
			} while (!correcto);
			if (t.equalsIgnoreCase("c")) {
				System.out.println(n+" Centímetros son: "+(n/2.54)+" pulgadas");
			}
			else {
				System.out.println(n+" Pulgadas son: "+(n*2.54)+" centímetros");
			}
			
					
			
			
		}
		
	}

}
