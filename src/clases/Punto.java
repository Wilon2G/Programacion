package clases;

import java.awt.Color;
import java.util.Objects;

import utilidades.StdDraw;

public class Punto {
	double x=7;  		//Atributos
	double y=7;  		//Atributos
	Color color;  		//Atributos
	private double movX;
	private double movY;
	

	public Punto(double x, double y, Color color) {
		super();
		setX(x);
		setY(y);
		setColor(color);
	}
	public Punto(double x, double y) {
		super();
		setX(x);
		setY(y);
		setColor(Color.black);
	}

	public Punto() {
		super();
		x=1;
		y=1;
		color=Color.black;
	}


	public String toString() {
		return "Punto [x=" + x + ", y=" + y + ", color=" + color + "]";
	}


	public double getMovX() {
		return movX;
	}
	public void setMovX(double movX) {
		this.movX = movX;
	}
	public double getMovY() {
		return movY;
	}
	public void setMovY(double movY) {
		this.movY = movY;
	}
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	public void dibujar() {
		if (color==null) {
			dibujar(Color.black,0.02);
		}
		dibujar(color,0.02);	
	}
	public void dibujar(Color colo, double n) {
		StdDraw.setPenRadius(n);
		StdDraw.setPenColor(colo);
		StdDraw.point(x, y);		
	}
	public double distancia(Punto p2) {
		return Math.sqrt(Math.pow((x-p2.x), 2)+Math.pow((y-p2.y), 2));
	}
	public static Punto puntoMedio(Punto p1, Punto p2) {
		Punto p=new Punto((p1.getX()+p2.getX())/2,(p1.getY()+p2.getY())/2);
		return p;
	}
	public Punto puntoMedio(Punto p2) {
		return Punto.puntoMedio(this, p2);
	}
	
	
	public void mover() {
		x=x+movX;
		y=y+movY;
	}

public boolean dentroDeCirculo(Circulo c) {
	return distancia(c.getCentro())<c.getRadio();
};


	

}
