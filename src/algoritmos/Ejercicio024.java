package algoritmos;

import utilidades.Entrada;

public class Ejercicio024 {

	public static void main(String[] args) {
		int n;
		while (true) {
			System.out.println("Introduzca una temperatura en grados celsius");
			n=Entrada.entero();
			System.out.println(n+" Grados celsisus son:");
			System.out.println((8*n/10)+" Grados Reamur");
			System.out.println((18*n/10)+32+" Grados Fahrenheit");
			System.out.println((n+273)+" Grados Kelvin");
			System.out.println("");
		}
	}

}
//Mete temperatura en grados celsius y la devuelve en lo demás