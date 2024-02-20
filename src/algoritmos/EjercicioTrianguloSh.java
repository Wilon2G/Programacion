package algoritmos;

import utilidades.Entrada;

public class EjercicioTrianguloSh {

	public static void main(String[] args) {
		boolean	solid = true;
		int fila;
		while (true) {
			
			fila=alturaTriangulo();

			solid = solidoSiNo();

			crearTriangulo(fila, solid);
			
			System.out.println("");
		}
	}
	
	private static int alturaTriangulo() {
		boolean c;
		int fila;
		do {
			System.out.println("Introduzca la altura deseada:");
			fila = Entrada.entero();
			c = fila > 0;
			if (!c) {
				System.out.println("Error, la altura debe ser positiva");
			}
		} while (!c);
		
		return fila;
	}

	private static boolean solidoSiNo() {
		boolean c, solid = true;
		String siNo;
		do {
			System.out.println("¿Sólido si o no?:");
			siNo = Entrada.cadena();
			if (siNo.equalsIgnoreCase("si")) {
				solid = true;
				c = true;
			} else {
				if (siNo.equalsIgnoreCase("no")) {
					solid = false;
					c = true;
				} else {
					c = false;
				}
			}

			if (!c) {
				System.out.println("Error, las opciones sin sí o no");
			}
		} while (!c);

		return solid;
	}

	private static void crearTriangulo(int fila, boolean solid) {
		int n = 1;
		int col = anchoTriangulo(fila);

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < (col - n) / 2; j++) {
				System.out.print("   ");
			}
			if (solid) {
				for (int j = 0; j < n; j++) {
					System.out.print(" * ");

				}
			}
			if (!solid) {
				if (i < fila - 1) {
					for (int j = 0; j < n; j++) {
						if (j == 0 || j == n - 1) {
							System.out.print(" * ");
						} else {
							System.out.print("   ");
						}
					}
				} else {
					for (int j = 0; j < n; j++) {
						System.out.print(" * ");

					}
				}

			}

			for (int j = 0; j < (col - n) / 2; j++) {
				System.out.print("   ");
			}
			System.out.println("");
			n = n + 2;
		}
	}

	private static int anchoTriangulo(int fila) {
		int col = 1;
		for (int i = 1; i < fila; i++) {
			col = col + 2;
		}
		return col;
	}
	
	

}
