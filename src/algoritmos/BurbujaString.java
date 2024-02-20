package algoritmos;

import utilidades.Entrada;

public class BurbujaString {

	public static void main(String[] args) {
		String[]arr=new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Entrada.cadena();
		}
		String[]arr2=burbuja(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]+"  ");
		}
		
	}
	
	private static String[] burbuja(String[] m) {
		String n;
		String[]m2=new String[m.length];
		for (int i = 0; i < m2.length; i++) {
			m2[i]=m[i];
		}
		boolean en;
		do {
			en=false;
			for (int j = 0; j < m2.length-1; j++) {
				if (m2[j].compareTo(m2[j+1])>0  ) {
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
