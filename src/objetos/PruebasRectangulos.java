package objetos;

import java.awt.Color;
import java.util.Random;

import utilidades.StdDraw;

public class PruebasRectangulos {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		Random ran= new Random();
		
		Rectangulo ventana=new Rectangulo(-50,50,50,-50);
		ventana.color(Color.green);
		Rectangulo r= new Rectangulo(-50,30,0,-10);
		r.color(Color.red);
		double vx=0.08,vy=0.08;
		
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			ventana.dibujar(false);
			r.dibujar(0.01);
			
			r.movimiento(vx, vy);
			r.mover();
			StdDraw.text(r.centro().getX(), r.centro().getY(), "Signal not found");
			
			if (r.dentroDe(ventana)) {
				StdDraw.setPenColor(Color.black);
				StdDraw.text(0, 0, "DENTRO");
			}
			else {
				StdDraw.setPenColor(Color.black);
				StdDraw.text(0, 0, "FUERA");
			}
			
			if (r.centroIzq().getX()<=ventana.centroIzq().getX()||r.getInfDer().getX()>=ventana.centroDer().getX()) {
				vx=-vx;
				r.color(Color.getHSBColor(ran.nextFloat(20,235), ran.nextFloat(20,235), ran.nextFloat(20,235)));
			}
			if (r.centroInf().getY()<=ventana.centroInf().getY()||r.getSupIzq().getY()>=ventana.centroSup().getY()) {
				vy=-vy;
				r.color(Color.getHSBColor(ran.nextFloat(20,235), ran.nextFloat(20,235), ran.nextFloat(20,235)));
			}
			
			
			StdDraw.show();
		} while (true);
	}

}
//