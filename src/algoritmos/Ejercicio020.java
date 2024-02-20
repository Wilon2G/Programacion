package algoritmos;

import utilidades.Entrada;

public class Ejercicio020 {

	public static void main(String[] args) {
		int r;
		r=1;
		do {
			if (r<=0) {
				System.out.println("Error, el radio debe ser positivo:");
			} else {
				System.out.println("Introduzca el radio:");
			}
			r=Entrada.entero();
		} while (r<=0);
		System.out.println("");
		System.out.println("La longitud de la circunferencia es: "+(2*r*3.14));
		System.out.println("El área del círculo es: "+Math.pow(r*3.14, 2)+" m^2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
