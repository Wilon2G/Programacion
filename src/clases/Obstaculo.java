package clases;

import java.awt.Color;

import utilidades.StdDraw;

public class Obstaculo {
	Punto centro;
	private Punto p1;
	private Punto p2;

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
		p1= new Punto(centro.getX(),centro.getY()+6);
		p2= new Punto(centro.getX(),centro.getY()-6);
	}

	
	
	public Obstaculo(Punto centro) {
		this(centro.getX(),centro.getY());
	}

	public Obstaculo(double x, double y) {
		super();
		setCentro(new Punto(x,y));
		p1= new Punto(x,y+6);
		p2= new Punto(x,y-6);
	}
	
	
	
	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		Obstaculo o1=new Obstaculo(0,0);
		
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			o1.dibujar();
			o1.rotar();
			StdDraw.show();
		} while (true);
		
		
	}

	private void rotar() {
		
	}

	private void dibujar() {
		StdDraw.setPenColor(Color.red);
		StdDraw.setPenRadius(0.005);
		StdDraw.line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		
	}
	
	
	

}
