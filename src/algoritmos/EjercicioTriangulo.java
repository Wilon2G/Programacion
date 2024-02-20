package algoritmos;

import utilidades.Entrada;

public class EjercicioTriangulo {

	public static void main(String[] args) {
		boolean c;
		int filas=0,columnas=1,n=1;
		do {
			System.out.println("Introduzca la altura:");
			filas=Entrada.entero();
			c=filas>0;
			if (!c) {
				System.out.println("Error, la altura debe ser mayor que cero");
			}
		} while (!c);
		for (int i = 1; i < filas; i++) {
			columnas=columnas+2;
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < (columnas-n)/2; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			for (int j = 0; j < (columnas-n)/2; j++) {
				System.out.print("   ");
			}
			n=n+2;
			System.out.println("");
		}
		
		
	}

}
