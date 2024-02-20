package algoritmos;

import utilidades.Entrada;

public class Ejercicio016 {

	public static void main(String[] args) {
		int n;
		while (true) {
			
			System.out.println("Introduzca un número");
			n=Entrada.entero();
			
			int fin=(1000-n)/10;
			
			for (int i=1; i<=fin; i++) {
				System.out.println(n+" + 10 = "+(n+10));
				n = n+10;
			}
			
			
			
		}
	
	}

}
