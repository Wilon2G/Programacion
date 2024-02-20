package algoritmos;

import utilidades.Entrada;

public class EjercicioMath {

	public static void main(String[] args) {
		while (true) {
			System.out.println("Introduzca el valor:");
			double n=Entrada.real();
			System.out.println("Introduzca los decimales:");
			System.out.println(redondear(Math.sqrt(n),Entrada.entero()));
		}
	}
	static double redondear(double n,int decimales) {
		if (decimales<0) {
			throw new IllegalArgumentException("El número de decimales no puede ser negativo "+decimales);
		}
		n=n*Math.pow(10, decimales);
		n=Math.round(n);
		n=n/Math.pow(10, decimales);
		return n;
	}
}
