package clases;



import java.awt.Color;
import java.util.Random;

import utilidades.StdDraw;

public class MoverPuntos {

	public static void main(String[] args) {
		Random r=new Random();
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		Punto p1= new Punto (-95, 95, Color.blue);
		Punto p2= new Punto (-95, -95, Color.red);
		
		p1.setMovX(0.1);
		p1.setMovY(0);
		
		p2.setMovX(0.1);
		p2.setMovY(0);
		
		boolean acabar=true;
		
		pintarEjes();
		double v1=r.nextDouble(0.1,0.9);
		double v2=r.nextDouble(0.1,0.9);
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			pintarEjes();
			p1.dibujar(Color.red,0.08);
			p2.dibujar(Color.blue,0.08);
			p1.mover();
			if (estaSupIz(p1)) {
				p1.setMovX(v1);
				p1.setMovY(0);
			}
			if (estaSupDer(p1)) {
				p1.setMovX(0);
				p1.setMovY(-v1);
			}
			if (estaInfDer(p1)) {
				p1.setMovX(-v1);
				p1.setMovY(0);
			}
			if (estaInfIz(p1)) {
				p1.setMovX(0);
				p1.setMovY(v1);
			}
			
			
			p2.mover();
			if (estaSupIz(p2)) {
				p2.setMovX(v2);
				p2.setMovY(0);
			}
			if (estaSupDer(p2)) {
				p2.setMovX(0);
				p2.setMovY(-v2);
			}
			if (estaInfDer(p2)) {
				p2.setMovX(-v2);
				p2.setMovY(0);
			}
			if (estaInfIz(p2)) {
				p2.setMovX(0);
				p2.setMovY(v2);
			}
			
			if (p1.distancia(p2)<5) {
				StdDraw.text(0, 5, "OH!");
				StdDraw.show();
				StdDraw.pause(2000);
				acabar=false;
			}
			
			StdDraw.show();
		} while (acabar);
		StdDraw.clear();
		StdDraw.text(0, 0, "GAME OVER :)");
		StdDraw.show();
		
		
		
	}




	private static boolean estaInfIz(Punto p1) {
		Punto vii= new Punto (-100,-100);
		double d= p1.distancia(vii);
		return d<9;
	}



	private static boolean estaInfDer(Punto p1) {
		Punto vid= new Punto (100,-100);
		double d= p1.distancia(vid);
		return d<9;
	}



	private static boolean estaSupDer(Punto p1) {
		Punto vsd= new Punto (100,100);
		double d= p1.distancia(vsd);
		return d<9;
	}



	private static boolean estaSupIz(Punto p1) {
		Punto vsi= new Punto (-100,100);
		double d= p1.distancia(vsi);
		return d<9;
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
