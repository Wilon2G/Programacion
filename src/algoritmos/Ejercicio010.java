package algoritmos;

import utilidades.Entrada;

public class Ejercicio010 {

	public static void main(String[] args) {
		int pos,neg,n;
		pos=0;
		neg=0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca números:");
			n=Entrada.entero();
			if (n>=0) {
				pos=pos+1;
			} else {
				neg=neg+1; 
			}
		}
		System.out.println("Ha introducido "+pos+" números positivos y "+neg+" números negativos");
	}

}
