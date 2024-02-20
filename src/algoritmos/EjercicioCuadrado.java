package algoritmos;

import utilidades.Entrada;

public class EjercicioCuadrado {

	public static void main(String[] args) {
		boolean correcto,contorno;
		int lado,lado2;
		String macizo;
		while (true) {
			do {
				System.out.println("Introduzca altura y base");
				lado=Entrada.entero();
				lado2=Entrada.entero();
				correcto=lado>0&&lado2>0;
				if (!correcto) {
					System.out.println("Los dos lados deben ser mayor que cero");
				}
			} while (!correcto);
			
			do {
				System.out.println("¿Macizo si o no?");
				macizo=Entrada.cadena();
				correcto=macizo.equalsIgnoreCase("si")||macizo.equalsIgnoreCase("no");
				if (!correcto) {
					System.out.println("Las opciones son si o no");
				}
			} while (!correcto);
			
			for (int fila = 1; fila <= lado; fila++) {
				
				for (int col = 1; col <= lado2; col++) {
					contorno=fila==1||fila==lado||col==1||col==lado2;
					if (contorno) {
						System.out.print(" * ");
					} else {
						if (macizo.equalsIgnoreCase("si")) {
							System.out.print(" * ");
						} else {
							System.out.print("   ");
						}
					}
					
				}
				System.out.println("");
			}
			
		}
		
	}

}

