package clases;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import objetos.Rectangulo;
import utilidades.StdDraw;

public class RectangulosDisminuidos {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		Random r = new Random();
		
		List<Rectangulo> rectangulos = generarRectangulos(10);
		
		int cnt=rectangulos.size()-1;
		boolean dir=false;
		
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			pintarEjes();
			
			
			while (cnt>=0&&cnt<rectangulos.size()) {
				
				rectangulos.get(cnt).color(Color.getHSBColor(r.nextFloat(255), r.nextFloat(255), r.nextFloat(255)));
				
				rectangulos.get(cnt).dibujar(false);
				
				if (dir) {
					cnt++;
				}
				if (!dir) {
					cnt--;
				}
				
				
				
				StdDraw.show();
				StdDraw.pause(400);
			}
			if (cnt<=0|cnt>=rectangulos.size()) {
				dir=!dir;
				if (!dir) {
					cnt=rectangulos.size()-1;
				}
				if (dir) {
					cnt=0;
				}
			}
			
			StdDraw.show();
		} while (true);
		
		
	}

	private static List<Rectangulo> generarRectangulos(double n) {
		List<Rectangulo> rectangulos = new ArrayList<Rectangulo>();
		for (int i = 1; i <= n; i++) {
			rectangulos.add(new Rectangulo(new Punto(-9*i,i*9),new Punto(i*9,-i*9)));
		}
		
		
		return rectangulos;
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
