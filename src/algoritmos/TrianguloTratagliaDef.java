package algoritmos;

import utilidades.Entrada;

public class TrianguloTratagliaDef {

	public static void main(String[] args) {
		boolean c;
		int altura = 0, columnas = 1, n = 1;
		int[] fila = { 1 };
		do {
			System.out.println("Introduzca la altura:");
			altura = Entrada.entero();
			c = altura > 0;
			if (!c) {
				System.out.println("Error, la altura debe ser mayor que cero");
			}
		} while (!c);
		for (int i = 1; i < altura; i++) {
			columnas = columnas + 2;
		}
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < (columnas - n) / 2; j++) {
				System.out.printf("%5s","");
			}

			for (int j1 = 0; j1 < fila.length; j1++) {
				if (j1%2!=0) {
					System.out.printf("%5s","");
				}
				System.out.printf("%5d",fila[j1]);
				if (j1%2!=0) {
					System.out.printf("%5s","");
				}
			}
			fila = siguientefila(fila);

			for (int j = 0; j < (columnas - n) / 2; j++) {
				System.out.print("   ");
			}
			n = n + 2;
			System.out.println("");
		}
	}

	private static int[] siguientefila(int[] fila) {
		int[] sig = new int[fila.length + 1];
		sig[0] = 1;
		sig[sig.length - 1] = 1;
		for (int i = 1; i < sig.length - 1; i++) {
			sig[i] = fila[i - 1] + fila[i];
		}
		return sig;
	}

}
