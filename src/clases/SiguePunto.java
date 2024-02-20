package clases;

import java.awt.Color;

import utilidades.StdDraw;

public class SiguePunto {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		boolean iniciar=true;
		double dificultad=0.08;
		StdDraw.enableDoubleBuffering();
		do {
			if (iniciar) {
				juego(dificultad);
			}
			iniciar=false;
			
			
			StdDraw.clear();
			StdDraw.setPenRadius(5);
			
			StdDraw.text(0, 0, "GAME OVER");
			
			
			StdDraw.setPenRadius(0.005);
			StdDraw.rectangle(0, -20, 30, 10);
			StdDraw.text(0, -20, "START");
			if (StdDraw.isMousePressed()&&(StdDraw.mouseX()>-30)&&(StdDraw.mouseX()<30)&&(StdDraw.mouseY()<-10)&&(StdDraw.mouseY()>-30)) {
				iniciar=true;
				StdDraw.pause(100);
			}
			
			StdDraw.show();
		} while (true);
		
	}

	
	
	private static void juego(double d) {
		ComeCocos c=new ComeCocos(-50,50);
		Punto p1 = new Punto(0, 0);
		Punto pdestino = new Punto(0, 0);
		boolean fin=true;
		
		while (fin) {
			StdDraw.clear();
			if ((c.getX()>p1.getX()-1  && c.getX()<p1.getX()+1 ) && (c.getY()>p1.getY()-1 && c.getY()<p1.getY()+1  )) {
				fin=false;
				
			}
			pintarEjes();
			ComeCocos.draw(c);
			p1.dibujar(Color.red,0.02);
			if (StdDraw.isMousePressed()) {
				pdestino = new Punto(StdDraw.mouseX(), StdDraw.mouseY());
			}
			if (p1.getX() < pdestino.getX()) {
				p1.setX(p1.getX() + 0.1);
			}
			if (p1.getX() > pdestino.getX()) {
				p1.setX(p1.getX() - 0.1);
			}

			if (p1.getY() < pdestino.getY()) {
				p1.setY(p1.getY() + 0.1);
			}
			if (p1.getY() > pdestino.getY()) {
				p1.setY(p1.getY() - 0.1);
			}
			
			
			if (c.getX() < p1.getX()) {
				c.setX(c.getX() + d);
			}
			if (c.getX() > p1.getX()) {
				c.setX(c.getX() - d);
			}

			if (c.getY() < p1.getY()) {
				c.setY(c.getY() + d);
			}
			if (c.getY() > p1.getY()) {
				c.setY(c.getY() - d);
			}

			StdDraw.show();
		}
		
	}



	private static void pintarEjes() {
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int i = -100; i <= 95; i = i + 3) {
			StdDraw.line(i, 0, i + 2, 0);
			StdDraw.line(0, i, 0, i + 2);
		}
		StdDraw.text(95, -4, "X");
		StdDraw.text(2.5, 95, "Y");
	}

}
