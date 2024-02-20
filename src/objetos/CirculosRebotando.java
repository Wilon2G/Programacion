package objetos;

import java.awt.Color;

import clases.Circulo;
import utilidades.StdDraw;

public class CirculosRebotando {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		double mx=0.08,my=0.03;
		
		Rectangulo [] ventanas=  {new Rectangulo(-100,100,0,0),new Rectangulo(0,100,100,0),new Rectangulo(0,0,100,-100),new Rectangulo(-100,0,0,-100)};
		ventanas[0].supIzq.setColor(Color.red);
		ventanas[1].supIzq.setColor(Color.blue);
		ventanas[2].supIzq.setColor(Color.green);
		ventanas[3].supIzq.setColor(Color.pink);
		
		Circulo [] circulos= {new Circulo(-50,50,20),new Circulo(50,50,10),new Circulo(50,-50,5),new Circulo(-50,-50,15)};
		circulos[0].setColor(Color.red);
		circulos[1].setColor(Color.blue);
		circulos[2].setColor(Color.green);
		circulos[3].setColor(Color.pink);
		for (int i = 0; i < circulos.length; i++) {
			circulos[i].getCentro().setMovX(mx);
			circulos[i].getCentro().setMovY(my);
		}
		
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			
			
			for (int i = 0; i < circulos.length; i++) {
				ventanas[i].dibujar(false);
				circulos[i].dibujar();
				circulos[i].mover();
				if (circulos[i].getCentro().getX()+circulos[i].getRadio()>=ventanas[i].getInfDer().getX()) {
					circulos[i].getCentro().setMovX(-circulos[i].getCentro().getMovX());
					
				}
				if (circulos[i].getCentro().getX()-circulos[i].getRadio()<=ventanas[i].getSupIzq().getX()) {
					circulos[i].getCentro().setMovX(-circulos[i].getCentro().getMovX());
					
				}
				if (circulos[i].getCentro().getY()+circulos[i].getRadio()>=ventanas[i].getSupIzq().getY()) {
					circulos[i].getCentro().setMovY(-circulos[i].getCentro().getMovY());
					
				}
				if (circulos[i].getCentro().getY()-circulos[i].getRadio()<=ventanas[i].getInfDer().getY()) {
					circulos[i].getCentro().setMovY(-circulos[i].getCentro().getMovY());
					
				}
			}
			
			
			
			
			StdDraw.show();
		} while (true);
		
	}

}
