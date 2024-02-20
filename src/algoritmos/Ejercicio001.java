package algoritmos;

import utilidades.Entrada;

public class Ejercicio001 {

	public static void main(String[] args) {
		int n1,n2;
		System.out.println("Introduzca el primer número:");
		n1=Entrada.entero();
		System.out.println("Introduzca el segundo número");
		n2=Entrada.entero();
		System.out.println("La suma es: "+(n1+n2));
		System.out.println("La resta es: "+(n1-n2));
		System.out.println("El produto es: "+(n1*n2));
		System.out.println("La división es: "+(n1/n2));
	}
}
