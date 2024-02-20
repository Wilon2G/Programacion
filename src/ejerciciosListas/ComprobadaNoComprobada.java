package ejerciciosListas;

import java.io.IOException;

public class ComprobadaNoComprobada {

	public static void main(String[] args) {
		
		
		
		try {
			miFuncion(0);
		} catch (IllegalArgumentException e) {
			System.out.println("Error capturado en main");
		}
		
		
		
		
		
	}

	private static void miFuncion(int a) {
		if (a>5) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Error en miFuncion");
			}
		}
		else {
			throw new IllegalArgumentException("Error no manejado en miFuncion");
		}
	}

	
	
	
}
