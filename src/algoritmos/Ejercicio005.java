package algoritmos;

import utilidades.Entrada;

public class Ejercicio005 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		System.out.println("Introduzca tres números:");
		n1=Entrada.entero();
		n2=Entrada.entero();
		n3=Entrada.entero();
		System.out.println("El orden es:");
		if (n1==n2) {
			if (n1==n3) {
				System.out.println("Los tres son iguales");
			} else {
				if (n1>n3) {
					System.out.println(n1+" = "+n2);
					System.out.println(n3);
				} else {
					System.out.println(n3);
					System.out.println(n1+" = "+n2);
				}
			}
		} else {
			if (n1==n3) {
				if (n1>n2) {
					System.out.println(n1+" = "+n3);
					System.out.println(n2);
				} else {
					System.out.println(n2);
					System.out.println(n1+" = "+n3);
				}
			} else {
				if (n3==n2) {
					if (n1>n2) {
						System.out.println(n1);
						System.out.println(n2+" = "+n3);
					} else {
						System.out.println(n2+" = "+n3);
						System.out.println(n1);
					}
				} else {
					if (n1>n2) {
						if (n1>n3) {
							if (n2>n3) {
								System.out.println(n1);
								System.out.println(n2);
								System.out.println(n3);
							} else {
								System.out.println(n1);
								System.out.println(n3);
								System.out.println(n2);
							}
						} else {
							System.out.println(n3);
							System.out.println(n1);
							System.out.println(n2);
						}
					} else {
						if (n1>n3) {
							System.out.println(n2);
							System.out.println(n1);
							System.out.println(n3);
						} else {
							if (n2>n3) {
								System.out.println(n2);
								System.out.println(n3);
								System.out.println(n1);
							} else {
								System.out.println(n3);
								System.out.println(n2);
								System.out.println(n1);
							}
						}
					}
				}
			}
		}
	}
}


