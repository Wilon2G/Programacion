package algoritmos;

import utilidades.Entrada;

public class Ejercicio018 {

	public static void main(String[] args) {
		int n,t;
		t=0;
		System.out.println("Introduzca números:");
		do {
			n=Entrada.entero();
			if (n>0) {
				t=t+1;
			}
			
		} while (n>0);
		System.out.println("Ha introducido "+t+" números positivos");
		
	}

}
