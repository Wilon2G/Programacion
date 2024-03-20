package objetos;

import java.awt.Color;

import clases.Punto;
import utilidades.StdDraw;

public class Rectangulo {

	Punto supIzq;
	Punto infDer;

	public String toString() {
		System.out.println("Rectangulo [supIzq=(" + supIzq.getX() + ',' + supIzq.getY() + ")" + ", infDer=("
				+ infDer.getX() + "," + infDer.getY() + ")]");
		return null;
	}

	public Rectangulo(Punto supIzq, Punto infDer) {

		this.supIzq = supIzq;
		this.infDer = infDer;

		setSupIzq(supIzq);
		setInfDer(infDer);
	}

	public Rectangulo(Punto supIzq, double ancho, double alto) {
		this(supIzq, new Punto(supIzq.getX() + ancho, supIzq.getY() - alto));
	}

	public Rectangulo(double x1, double y1, double x2, double y2) {
		this(new Punto(x1, y1), new Punto(x2, y2));
	}

	public Punto getSupIzq() {
		return supIzq;
	}

	public void setSupIzq(Punto supIzq) {
		if (supIzq == null) {
			throw new IllegalArgumentException("Error, Punto superior izquierdo está en Null");
		}
		if (supIzq.getX() >= infDer.getX() || supIzq.getY() <= infDer.getY()) {
			throw new IllegalArgumentException("Error, vértices del rectángulo incompatibles");
		}
		this.supIzq = supIzq;
	}

	public Punto getInfDer() {
		return infDer;
	}

	public void setInfDer(Punto infDer) {
		if (infDer == null) {
			throw new IllegalArgumentException("Error, Punto inferior derecho está en Null");
		}
		if (supIzq.getX() >= infDer.getX() || supIzq.getY() <= infDer.getY()) {
			throw new IllegalArgumentException("Error, vértices del rectángulo incompatibles");
		}
		this.infDer = infDer;
	}

	public double altura() {
		return supIzq.getY() - infDer.getY();
	}

	public double base() {
		return infDer.getX() - supIzq.getX();
	}

	public double area() {
		return base() * altura();
	}

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);

		Rectangulo r = new Rectangulo(-10, 10, 10, -10);
		double altura = r.altura();
		double base = r.base();
		double area = r.area();
		System.out.println(altura + " " + base + " " + area);
		
		
		r.dibujar(0.007);

	}
	
	

	public void movimiento(double x, double y) {
		supIzq.setMovX(x);
		supIzq.setMovY(y);
		infDer.setMovX(x);
		infDer.setMovY(y);
	}

	public void color(Color c) {
		supIzq.setColor(c);
	}

	public void dibujar(double grosor) {
		StdDraw.setPenColor(supIzq.getColor());
		StdDraw.setPenRadius(grosor);
		StdDraw.rectangle(centro().getX(), centro().getY(), base() / 2, altura() / 2);
	}

	public void dibujar(boolean b) {
		StdDraw.setPenColor(supIzq.getColor());
		StdDraw.setPenRadius(0.005);
		if (b) {
			dibujar();
		}
		else {
			StdDraw.rectangle(centro().getX(), centro().getY(), base()/2, altura()/2);
		}
	}

	public Punto centroIzq() {
		return supIzq.puntoMedio(infIzq());
	}

	public Punto centroDer() {
		return infDer.puntoMedio(supDer());
	}

	public Punto centroSup() {
		return supIzq.puntoMedio(supDer());
	}

	public Punto centroInf() {
		return infDer.puntoMedio(infIzq());
	}

	public Punto centro() {
		return supIzq.puntoMedio(infDer);
	}

	public Punto infIzq() {
		return new Punto(supIzq.getX(), infDer.getY());
	}

	public Punto supDer() {
		return new Punto(supIzq.getY(), infDer.getX());
	}

	public void dibujar() {
		StdDraw.setPenColor(supIzq.getColor());
		StdDraw.setPenRadius(0.005);
		StdDraw.filledRectangle(centro().getX(), centro().getY(), base() / 2, altura() / 2);
	}
	

	public void mover() {
		supIzq.mover();
		infDer.mover();
		
	}

	public boolean dentroDe(Rectangulo otro) {
		
		return supIzq.getX()>otro.supIzq.getX()&&supIzq.getY()<otro.supIzq.getY()&&infDer.getX()<otro.infDer.getX()&&infDer.getY()>otro.infDer.getY();
	}

	public int colision(Rectangulo ventana) {
		/* 0-No hay colision, 1-Derecha, 2-Izquierda, 3-Arriba, 4-Abajo,
		   5-esquina sup dcha, 6-esquina sup izq, 7-esquina inf  izq, 8-esquina inf der, */
		int zonacol=0;
		if (infDer.getX()>=ventana.infDer.getX()) { //derecha
			zonacol=1;
		}
		if (centroIzq().getX()<=ventana.centroIzq().getX()) { //izquierda
			zonacol= 2;
		}
		if (supIzq.getY()>=ventana.supIzq.getY()) {  //arriba
			zonacol= 3;
		}
		if (centroInf().getY()<=ventana.centroInf().getY()) { //abajo
			zonacol= 4;
		}
		if (supIzq.getY()>=ventana.supIzq.getY()&&infDer.getX()>=ventana.infDer.getX()) {
			zonacol=5;
		}
		if (supIzq.getY()>=ventana.supIzq.getY()&&centroIzq().getX()<=ventana.centroIzq().getX()) {
			zonacol=6;
		}
		if (centroInf().getY()<=ventana.centroInf().getY()&&centroIzq().getX()<=ventana.centroIzq().getX()) {
			zonacol=7;
		}
		if (centroInf().getY()<=ventana.centroInf().getY()&&infDer.getX()>=ventana.infDer.getX()) {
			zonacol=8;
		}
		
		return zonacol;
	}

}
