package ejerciciosListas;

import utilidades.Entrada;

public class Pruebas2 {

	public static void main(String[] args) {
		boolean c =true;
		double res=0;
		do {
			int n= Entrada.entero("Introduzca un número: ", "Número Erróneo");
			try {
				res=100.0/n;
				c=false;
			} catch (ArithmeticException e) {
				System.out.println("El número no debe ser cero");
			}
		} while (c);
		
		System.out.println("Número introducido etre 100 es: "+res);
	}

}
