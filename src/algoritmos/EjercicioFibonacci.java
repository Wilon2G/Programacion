package algoritmos;

import utilidades.Entrada;

public class EjercicioFibonacci {

	public static void main(String[] args) {
		int n;
		int ulti=1;
		int penulti=0;
		boolean correcto;
		do {
			System.out.println("Introduzca el número de secuencia:");
			n=Entrada.entero();
			correcto=n>0;
			if (!correcto) {
				System.out.println("Error, el número debe ser mayor que cero");
			}
		} while (!correcto);
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				ulti=penulti+ulti;
				System.out.print(penulti+" ");
			} else {
				System.out.print(ulti+" ");
				penulti=ulti+penulti;
			}	
		}
	}
}
