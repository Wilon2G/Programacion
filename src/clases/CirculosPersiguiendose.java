package clases;

import java.awt.Color;
import java.util.Random;

import utilidades.StdDraw;

public class CirculosPersiguiendose {
	static final int ESQUINA_SUPERIOR_IZQUIERDA=1;
	static final int ESQUINA_SUPERIOR_DERECHA=2;
	static final int ESQUINA_INFERIOR_IZQUIERDA=3;
	static final int ESQUINA_INFERIOR_DERECHA=4;

	public static void main(String[] args) {
		Random r=new Random();
		
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		double n=r.nextDouble(5,20);
		n=20;
		Circulo c= new Circulo(new Punto(100-n,100-n),n);
		
		double n2=r.nextDouble(5,20);
		n2=20;
		Circulo c2= new Circulo(-100+n2,-100+n2,n2);
		
		
		c.setColor(Color.red);
		c2.setColor(Color.blue);
		

		boolean acabar=true;
		double v1=r.nextDouble(0.1,1);
		double v2=r.nextDouble(0.1,1);
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			c.dibujar();
			c2.dibujar(0.006);
			c.mover();
			detectar(c,v1);
			
			c2.mover();
			detectar(c2,v2);
			
			if (c.getCentro().distancia(c2.getCentro())<c.getRadio()+c2.getRadio()) {
				StdDraw.text(0, 5, "OH!");
				StdDraw.show();
				StdDraw.pause(2000);
				StdDraw.text(0, -5, "PILLADO ;)");
				StdDraw.show();
				StdDraw.pause(2000);
				acabar=false;
			}
			
			StdDraw.show();
		} while (acabar);
		
		
	}
	
	private static void detectar(Circulo c, double velocidad) {
		int esquina= estaEnEsquina(c);
		
		switch (esquina) {
		case ESQUINA_INFERIOR_IZQUIERDA: 
			c.setCentro(new Punto(-100+c.getRadio(),-100+c.getRadio(),c.getColor()));
			c.cambiarTrayectoria(0,velocidad);
			break;
		case ESQUINA_INFERIOR_DERECHA:
			c.setCentro(new Punto(100-c.getRadio(),-100+c.getRadio(),c.getColor()));
			c.cambiarTrayectoria(-velocidad, 0);
			break;
		case ESQUINA_SUPERIOR_DERECHA:
			c.setCentro(new Punto(100-c.getRadio(),100-c.getRadio(),c.getColor()));
			c.cambiarTrayectoria(0, -velocidad);
			break;
		case ESQUINA_SUPERIOR_IZQUIERDA:
			c.setCentro(new Punto(-100+c.getRadio(),100-c.getRadio(),c.getColor()));
			c.cambiarTrayectoria(velocidad, 0);
			break;
		
		default:
			break;
		}
		
		
	}

	private static int estaEnEsquina(Circulo c) {
		Punto vii= new Punto (-100,-100); //Inf Izq
		Punto vid= new Punto (100,-100);  //Inf Der
		Punto vsd= new Punto (100,100);   //Sup Der
		Punto vsi= new Punto (-100,100);  //Sup Izq
		if (Math.pow( c.getCentro().distancia(vii), 2)-0.0001<=(Math.pow(c.getRadio(), 2)+Math.pow(c.getRadio(), 2))) {
			return ESQUINA_INFERIOR_IZQUIERDA;
		}
		if (Math.pow(c.getCentro().distancia(vid), 2)-0.0001<=(Math.pow(c.getRadio(), 2)+Math.pow(c.getRadio(), 2))) {
			return ESQUINA_INFERIOR_DERECHA;
		}
		if (Math.pow(c.getCentro().distancia(vsd), 2)-0.0001<=(Math.pow(c.getRadio(), 2)+Math.pow(c.getRadio(), 2))) {
			return ESQUINA_SUPERIOR_DERECHA;
		}
		if (Math.pow(c.getCentro().distancia(vsi), 2)-0.0001<=(Math.pow(c.getRadio(), 2)+Math.pow(c.getRadio(), 2))) {
			return ESQUINA_SUPERIOR_IZQUIERDA;
		}
		else {
			return -1;
		}
		
	}

	

}


