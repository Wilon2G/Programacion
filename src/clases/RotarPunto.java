package clases;

import utilidades.StdDraw;

public class RotarPunto {
	static boolean recienPulsado=false;

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		Circulo c = new Circulo(50,50,5);
		
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			
			c.dibujar();
			if (clickRaton()) {
				c.rotar(20);
			}
			
			
			
			StdDraw.show();
		} while (true);
		
	}

	
	private static boolean clickRaton() {
		if (StdDraw.isMousePressed()) {
			if (!recienPulsado) {
				recienPulsado = true;
				return true;
			}
		}
		else {
			recienPulsado = false;
		}
		
		return false;
	}
	
}
