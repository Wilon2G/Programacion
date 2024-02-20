package algoritmos;
import java.util.Random;

public class Matrices {

	public static void main(String[] args) {
		//colección de números repartidos en filas y columnas
		//filas y columnas [][] respectivamente
		int [][] m = crearmatriz(4,5,0,9);
		//System.out.println(m[1][1]);
		//System.out.println(m.length); //esto es el ALTO de la matriz
		//System.out.println(m[0].length); //y esto sería el ANCHO de la matriz
		
		mostrarmatriz(m);
	}

	private static int[][] crearmatriz(int fila, int col, int min, int max) {
		int [][] m =new int[fila][col];
		Random r=new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=r.nextInt(min,max);
			}
		}
		
		return m;
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
