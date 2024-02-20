package algoritmos;

import utilidades.Entrada;

public class EjercicioArrays {

	public static void main(String[] args) {
		int[]numeros=new int[10];
		for (int i = 0; i < numeros.length/2; i++) {
			numeros[i] =Entrada.entero();
		}
		for (int i = 5; i < numeros.length; i++) {
			numeros[i]=numeros[i-5]*2;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println(5/2);
		
		
		
		
		
		
	}

}
