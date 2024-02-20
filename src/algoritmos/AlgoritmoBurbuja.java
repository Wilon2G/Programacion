package algoritmos;

import java.util.Random;



public class AlgoritmoBurbuja {

	public static void main(String[] args) {
		
		int[]m=arrayRandom(40);
		
		
		
		int[]m2=burbuja(m);
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i]+"  ");
		}
		System.out.println("");
		System.out.println("El orden es:");
		for (int i = 0; i < m2.length; i++) {
			System.out.print(m2[i]+"  ");
		}
	}

	
	private static int[] arrayRandom(int n) {
		Random r=new Random();
		int[]m=new int[n];
		for (int i = 0; i < m.length; i++) {
			m[i]=r.nextInt(-4,10);
		}
		
		
		return m;
	}


	private static int[] burbuja(int[] m) {
		int n;
		int[]m2=new int[m.length];
		for (int i = 0; i < m2.length; i++) {
			m2[i]=m[i];
		}
		boolean en;
		do {
			en=false;
			for (int j = 0; j < m2.length-1; j++) {
				if (m2[j]>m2[j+1]) {
					n=m2[j];
					m2[j]=m2[j+1];
					m2[j+1]=n;
					en=true;
				} 
			}
		} while (en);
		return m2;
	}

	
}
