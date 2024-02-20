package algoritmos;

import utilidades.Entrada;

public class EjercicioFactorial {

	public static void main(String[] args) {
		int n;
		System.out.println("Introduzca un número:"); //si se mete negativo da error
		n=Entrada.entero();
		System.out.println(factorial(n));
		System.out.println(factorial2(n));
	}
	private static int factorial(int n) {
		if (n<0) {
			throw new IllegalArgumentException("Factorial no admite parámetros negativos "+n);
		}
		int cnt;
		int r = 1;
		cnt = n;
		for (int i = 0; i < cnt; i++) {
			r = r * n;
			n = n - 1;
		}
		return r;
	}
	private static int factorial2(int n) {
		if (n<0) {
			throw new IllegalArgumentException("Factorial no admite parámetros negativos "+n);
		}
		if (n==0) {
			return 1;
		}
		else {
			return n*factorial2(n-1);
		}
	}
}
