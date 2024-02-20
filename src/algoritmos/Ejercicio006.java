package algoritmos;

import utilidades.Entrada;

public class Ejercicio006 {

	public static void main(String[] args) {
		int n;
		System.out.println("Introduzca número");
		n=Entrada.entero();
		if (n>=10 && n<=100) {
			System.out.println(n+" Está entre 10 y 100");
		} else {
			System.out.println(n+" No está entre 10 y 100");
		}
	}

}
