package algoritmos;

import utilidades.Entrada;

public class Ejercicio003 {

	public static void main(String[] args) {
		int n1,n2;
		while (true) {
			System.out.println("Introduzca primer número");
			n1=Entrada.entero();
			System.out.println("Introduzca segundo número");
			n2=Entrada.entero();
			if (n1%n2==0) {
				System.out.println(n1+" Es divisor de "+n2);
			} else {
				System.out.println(n1+" No es divisor de "+n2);
			}
			if (n2%n1==0) {
				System.out.println(n2+" Es divisor de "+n1);
			} else {
				System.out.println(n2+" No es divisor de "+n1);
			}
			
		}
		
	}

}
