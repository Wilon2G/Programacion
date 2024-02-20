package algoritmos;

import utilidades.Entrada;

public class LeerTemperatura {

	public static void main(String[] args) {
		
		double tem;
		System.out.println("Introduzca la temperatura:");
		tem=Entrada.real();
		System.out.println(tem*2);
		
		String nom;
		System.out.println("Introduzca su nombre:");
		nom=Entrada.cadena();
		System.out.println("Su sombre es: "+ nom );
		boolean verdad;
		do {
			int cont;
			System.out.println("Introduzca la contraseña:");
			cont=Entrada.entero();
			verdad=cont==7;
			if (verdad) {
				System.out.println("correcto");
			} else {
				System.out.println("Contraseña incorrecta");
			}
		}while (!verdad);
		
		
	}
}
