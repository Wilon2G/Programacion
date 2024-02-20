package algoritmos;

import java.util.Random;

import utilidades.Entrada;

public class SumaMatrices {

	public static void main(String[] args) {
		int n;
		int[][] m1 = crearmatriz(3, 3, 0, 9);
		int[][] m2 = crearmatriz(3, 3, 0, 9);
		System.out.println("La suma de: ");
		mostrarmatriz(m1);
		System.out.println("Más:");
		mostrarmatriz(m2);
		System.out.println("Es =");
		int[][] m3 = sumaMatriz(m1, m2);
		mostrarmatriz(m3);
		System.out.println("Qué fila desea extraer?");
		n=Entrada.entero();
		int [] arr=extraerFila(m3,n);
		mostrararray(arr);
		System.out.println("");
		System.out.println("Indique la columna que desee extraer:");
		n=Entrada.entero();
		arr=extraercolumna(m3,n);
		mostrararray(arr);
	}

	private static int[] extraercolumna(int[][] m3, int n) {
		if (m3[0].length<n||n<0) {
			throw new IllegalArgumentException("Error, la matriz debe tener la columna indicada");
		}
		int[] res=new int[m3[0].length];
		for (int i = 0; i < m3.length; i++) {
			res[i]=m3[i][n];
		}
		return res;
	}

	private static int[] extraerFila(int[][] m3, int n) {
		if (m3.length<n||n<0) {
			throw new IllegalArgumentException("Error, la matriz debe tener la columna indicada");
		}
		int [] res=new int[m3[n].length];
		for (int i = 0; i < res.length; i++) {
			res[i]=m3[n][i];
		}
		return res;
	}

	private static int[][] sumaMatriz(int[][] m1, int[][] m2) {
		if (!comprobarCompatible(m1, m2)) {
			throw new IllegalArgumentException("Error, las matrices deben tener el mismo número de filas y columnas");
		}
		int[][] m3 = new int[m1.length][m1[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}

	private static boolean comprobarCompatible(int[][] m1, int[][] m2) {
		int col1 = 0, col2 = 0, fila1 = 0, fila2 = 0;

		col1 = m1.length;
		fila1 = m1.length;

		col2 = m2.length;
		fila2 = m2.length;

		if (col1 == col2 && fila1 == fila2) {
			return true;
		} else {
			return false;
		}
	}

	private static int[][] crearmatriz(int fila, int col, int min, int max) {
		int[][] m = new int[fila][col];
		Random r = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt(min, max);
			}
		}

		return m;
	}

	public static void mostrarmatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print("[");
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.print("  ]");
			System.out.println("");
		}
	}
	
	public static void mostrararray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
