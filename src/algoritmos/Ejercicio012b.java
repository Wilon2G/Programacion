package algoritmos;

import utilidades.Entrada;

public class Ejercicio012b {

	public static void main(String[] args) {
		int max,min;
		boolean primo;
		while (true) {
			do {
				System.out.println("Introduzca el intervalo:");
				min=Entrada.entero();
				max=Entrada.entero();
				if (min<=0||max<0||max<min) {
					System.out.println("Error, el intervalo debe ser mínimo mayor que cero y el máxima mayor que el mínimo");
					System.out.println(" ");
				}
			} while (min<=0||max<0||max<min);
			
			System.out.println("Los números primos entre "+min+" y "+max+" son:");
			while (min<=max) {
				primo=true;
				for (int i = 2; i < min-1; i++) {
					if (min%i==0) {
						primo=false;
					}
				}
				if (primo) {
					System.out.print(min+" ");
				}
				min=min+1;
			}
			System.out.println(" ");
			System.out.println(" ");
		}
	}

}
