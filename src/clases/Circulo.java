package clases;

import java.awt.Color;
import java.util.Objects;

import objetos.Rectangulo;
import utilidades.StdDraw;

public class Circulo {
	Punto centro;
	double radio;
	
	
	
	
	public Circulo(Punto p, double i) {
		setCentro(p);
		setRadio(i);
	}


	public Circulo(double x, double y, double radio) {
		setCentro(new Punto(x,y));
		setRadio(radio);
	}


	public Circulo() {
		this(0,0,1);
	}


	public Punto getCentro() {
		return centro;
	}


	public void setCentro(Punto centro) {
		if (centro==null) {
			throw new IllegalArgumentException("Error, el centro no debe ser Null, introduzca un Punto o dos coordenadas");
		}
		this.centro = centro;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		if (radio<=0) {
			throw new IllegalArgumentException("Error, el radio "+radio+" debe ser mayor que cero");
		}
		this.radio = radio;
	}
	

	public Color getColor() {
		return centro.getColor();
	}

	
	public void setColor(Color color) {
		centro.setColor(color);
	};
	
	public void setColor(int red, int green, int blue) {
		
		centro.setColor(new Color(red,green,blue));
	}


	public void dibujar() {
		StdDraw.setPenColor(centro.getColor());
		StdDraw.filledCircle(centro.getX(), centro.getY(), radio);
	}


	public void dibujar(double d) {
		StdDraw.setPenRadius(d);
		StdDraw.setPenColor(centro.getColor());
		StdDraw.circle(centro.getX(), centro.getY(), radio);
	}


	public void mover() {
		centro.mover();
	}


	public void cambiarTrayectoria(double velx, double vely) {
		centro.setMovX(velx);
		centro.setMovY(vely);
	}


	public boolean seSuperpone(Circulo c) {
		
		return this.getCentro().distancia(c.getCentro())<this.getRadio()+c.getRadio();
	}


	public void movimiento(double velocidadx, double velocidady) {
		this.getCentro().setMovX(velocidadx);
		this.getCentro().setMovY(velocidady);
	}



	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}


	public void rotar(double grados) {
		double rad=Math.toRadians(grados);
		double nuevaX=centro.getX()*Math.cos(rad)-centro.getY()*Math.sin(rad);
		double nuevaY=centro.getX()*Math.sin(rad)+centro.getY()*Math.cos(rad);
		centro.x=nuevaX;
		centro.y=nuevaY;
	}


	public int colision(Rectangulo r) {
		/* 0-No hay colision, 1-Derecha, 2-Izquierda, 3-Arriba, 4-Abajo,
		   5-esquina sup dcha, 6-esquina sup izq, 7-esquina inf  izq, 8-esquina inf der, */
		int zonaColision=0;
		if (centro.getX()+radio>=r.getInfDer().getX())
			zonaColision=1;
		if (centro.getX()-radio<=r.getSupIzq().getX())
			zonaColision=2;
		if (centro.getY()+radio>=r.getSupIzq().getY())
			zonaColision=3;
		if (centro.getY()-radio<=r.getInfDer().getY())
			zonaColision=4;
		if (centro.getX()+radio>=r.getInfDer().getX() && centro.getY()+radio>=r.getSupIzq().getY())
			zonaColision=5;
		if (centro.getX()-radio<=r.getSupIzq().getX() && centro.getY()+radio>=r.getSupIzq().getY())
			zonaColision=6;
		if (centro.getX()-radio<=r.getSupIzq().getX() && centro.getY()-radio<=r.getInfDer().getY())
			zonaColision=7;	
		if (centro.getX()+radio>=r.getInfDer().getX() && centro.getY()-radio<=r.getInfDer().getY())
			zonaColision=8;
		
		return zonaColision;
	}


	


	


	

}
