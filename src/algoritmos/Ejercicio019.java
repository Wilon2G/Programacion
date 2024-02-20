package algoritmos;

import utilidades.Entrada;

public class Ejercicio019 {

	public static void main(String[] args) {
		String t;
		boolean sal;
		int neg,pos,n;
		neg=0;
		pos=0;
		System.out.println("Introduzca números o escriba salir:");
		do {
			t=Entrada.cadena();
			sal = t.equals("salir");
			if (!sal) {
				n=Integer.valueOf(t);
				if (n<0) {
					neg=neg+1;
				} else {
					pos=pos+1;
				}
			}
			
		} while (!sal);
		System.out.println("Hay "+neg+" numeros negativos");
		System.out.println("Hay "+pos+" numeros positivos");
		
		
		
		
		
	}

}
