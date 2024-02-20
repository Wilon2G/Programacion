package objetos;

import java.awt.Color;

import utilidades.StdDraw;

public class RectanguloRebota {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		int colision=0;
		
		Rectangulo [] ventanas=  {new Rectangulo(-100,100,0,0),new Rectangulo(0,100,100,0),new Rectangulo(0,0,100,-100),new Rectangulo(-100,0,0,-100)};
		ventanas[0].supIzq.setColor(Color.red);
		ventanas[1].supIzq.setColor(Color.blue);
		ventanas[2].supIzq.setColor(Color.green);
		ventanas[3].supIzq.setColor(Color.pink);
		
		Rectangulo [] rectangulos = {new Rectangulo(-65,65,-45,45),new Rectangulo(45,65,65,45),new Rectangulo(45,-45,65,-65),new Rectangulo(-65,-45,-45,-65)};
		rectangulos[0].supIzq.setColor(Color.red);
		rectangulos[1].supIzq.setColor(Color.blue);
		rectangulos[2].supIzq.setColor(Color.green);
		rectangulos[3].supIzq.setColor(Color.pink);
		
		for (int i = 0; i < rectangulos.length; i++) {
			rectangulos[i].movimiento(0.07, 0.1);
		}
		
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			
			
			
			for (int i = 0; i < rectangulos.length; i++) {
				rectangulos[i].dibujar();
				rectangulos[i].mover();
				ventanas[i].dibujar(false);
				colision=rectangulos[i].colision(ventanas[i]);
				switch (colision) {
				case 1:
				case 2:
					rectangulos[i].movimiento(-rectangulos[i].supIzq.getMovX(), rectangulos[i].supIzq.getMovY());
					break;
				case 3:
				case 4:
					rectangulos[i].movimiento(rectangulos[i].supIzq.getMovX(), -rectangulos[i].supIzq.getMovY());
					break;
				case 5:
				case 6:
				case 7:
				case 8:
					rectangulos[i].movimiento(-rectangulos[i].supIzq.getMovX(), -rectangulos[i].supIzq.getMovY());
					break;

				default:
					break;
				}
			}
			
		
		
			
			
			
			
		StdDraw.show();
		
		} while (true);
		
		
		
	}
	
	private static void pintarEjes() {
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int i = -100; i <= 95; i = i + 3) {
			StdDraw.line(i, 0, i + 2, 0);
			StdDraw.line(0, i, 0, i + 2);
		}
		StdDraw.text(95, -4, "X");
		StdDraw.text(2.5, 95, "Y");
	}

}
