package algoritmos;

import utilidades.Entrada;

public class Ejercicio2023 {

	public static void main(String[] args) {
		int n,n1,cnt=0;
		boolean c;
		do {
			System.out.println("Introduzca un número positivo:");
			n = Entrada.entero();
			c = n > 0;
			if (!c) {
				System.out.println("Error, el número debe ser positivo");
			}
		} while (!c);
		n1=n;
		do {
			cnt=cnt+1;
			System.out.println(n%2);
			n=n/2;
		} while (n>0);
		
		int[] bin=new int[cnt];
		for (int i = 0; i < bin.length; i++) {
			bin[i]=n1%2;
			n1=n1/2;
		}
		for (int i = bin.length-1; i >-1 ; i--) {
			System.out.print(bin[i]);
		}

	}

}
