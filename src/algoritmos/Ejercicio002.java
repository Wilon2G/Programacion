package algoritmos;

import utilidades.Entrada;

public class Ejercicio002 {

	public static void main(String[] args) {
		int n1,n2;
		System.out.println("Introduzca el primer número");
		n1=Entrada.entero();
		System.out.println("Introduzca segundo número");
		n2=Entrada.entero();
		if (n1==n2) {
			System.out.println("Son iguales");
		}
		else {
			if (n1>n2) {
				System.out.println(n1+" Es mayor que "+n2);
			} else {
				System.out.println(n1+" Es menor que "+n2);
			}
		}
		

	}

}
