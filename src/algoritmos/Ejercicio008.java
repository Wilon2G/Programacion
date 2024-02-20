package algoritmos;

import utilidades.Entrada;

public class Ejercicio008 {

	public static void main(String[] args) {
		int n,cont,m,mm,mmm;
		cont=0;
		m=0;
		mm=0;
		mmm=0;
		for (cont=1; cont <= 10; cont++) {
			System.out.println("Introduzca los Números:");
			n=Entrada.entero();
			if (n<25) {
				m=m+1;
			} else {
				if (n<70) {
					mm=mm+1;
				} else {
					mmm=mmm+1;
				}
			}
		}
		System.out.println("Hay "+m+" números menores que 25");
		System.out.println("Hay "+mm+" números mayores que 25 y menores de 70");
		System.out.println("Hay "+mmm+" números mayores de 70");
		
	}

}
