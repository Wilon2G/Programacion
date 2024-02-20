package algoritmos;

import utilidades.Entrada;

public class BurbujaChar {

	public static void main(String[] args) {
		char[]arr=new char[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Entrada.caracter();	
		}
	char[]arr2=burbuja(arr);
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+"  ");
	}
		
		
	}
	
	
	private static char[] burbuja(char[] m) {
		char n;
		char[]m2=new char[m.length];
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
