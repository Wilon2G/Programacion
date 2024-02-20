package ejerciciosListas;

import utilidades.Entrada;

public class PruebasExcepciones {

	public static void main(String[] args) {
		boolean c=true;
		do {
			try {
				System.out.print("Introduzca un número: ");
				int n = Entrada.entero();
				int res =100/n;
				System.out.println("El número introducido es "+n);
				c=false;
			} catch (NumberFormatException e) {
				System.out.println("Error en número");
			}
			catch (ArithmeticException e) {
				System.out.println("Error, introduzca un número distinto de cero");
			}
			
			
		} while (c);
		
		
		System.out.println("Adiós");
	}

}
