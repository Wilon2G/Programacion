package algoritmos;

import java.util.Random;



public class MultiplicarMatrices {

	public static void main(String[] args) {
		
		int [][] m1={ {5,2,1},{2,1,2},{4,1,3}};   //crearmatriz(3,3,0,9);
		mostrarmatriz(m1);
		System.out.println("");
		int[][] m2= {{1,4},{0,3},{2,1}};  //crearmatriz(3,3,0,9);
		mostrarmatriz(m2);
		System.out.println();
		int[][] m= multiplicarmatriz(m1,m2);
		mostrarmatriz(m);
		System.out.println("");
		System.out.println("");
		System.out.println("");

		int [][] m4=crearmatriz(3,3,0,9);
		mostrarmatriz(m4);
		int [][] m5=submatriz(m4,2,2,2,3);
		mostrarmatriz(m5);
	}
	
	private static int[][] submatriz(int[][] m4, int filaDesde, int filaHasta, int colDesde, int colHasta) {
		if (filaDesde>filaHasta||colDesde>colHasta) {
			throw new IllegalArgumentException();
		}
		int [][] sol= new int[filaHasta-filaDesde+1][colHasta-colDesde+1];
		if (sol.length>m4.length||sol[0].length>m4[0].length) {
			throw new IllegalArgumentException();
		}
		return null;
	}

	private static int[][] multiplicarmatriz(int[][] m1, int[][] m2) {
		if (m1[0].length!=m2.length) {
			throw new IllegalArgumentException("Las columnas de la primera matriz debe ser iguales al número de filas de m2");
		}
		int[][]m3=new int[m1.length][m2[0].length];
		
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[i].length; j++) {
				int[]filam1=extraerFila(m1,i);
				int[]columnam2=extraercolumna(m2,j);
				System.out.println(filam1.length+"--"+columnam2.length);
				for (int k = 0; k < columnam2.length; k++) {
						m3[i][j]=m3[i][j]+filam1[k]*columnam2[k];
				}
				
			}
		}
		
		return m3;
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
	
	private static int[] extraercolumna(int[][] m3, int n) {
		if (n>=m3[0].length||n<0) {
			throw new IllegalArgumentException("Error, la matriz debe tener la columna indicada:"+n);
		}
		int[] res=new int[m3.length];
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
	
	public static void mostrarmatriz(int[][]m) {
	for (int i = 0; i < m.length; i++) {
		System.out.print("[");
		for (int j = 0; j < m[i].length; j++) {
			System.out.printf("%5d",m[i][j]);
		}
		System.out.print("  ]");
		System.out.println("");
		
		}
	}
	
}
