package clases;



import java.awt.Color;
import java.util.Random;

import utilidades.StdDraw;

public class TestStdDraw {

	public static void main(String[] args){
		StdDraw.setXscale(-100,100);
		StdDraw.setYscale(-100,100);
		Random r=new Random();
		
		Punto p1=new Punto(r.nextInt(-100,101),r.nextInt(-100,101));
		Punto p2=new Punto(r.nextDouble(-100,101),r.nextDouble(-100,101));
		
		StdDraw.enableDoubleBuffering();
        while (true) {
        	StdDraw.clear();
        	pintarEjes();
        	StdDraw.setPenRadius(0.01);
            StdDraw.setPenColor(StdDraw.MAGENTA);
        	//StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());
        	double xRaton= StdDraw.mouseX();
            double yRaton=StdDraw.mouseY();
            Punto pm= (Punto.puntoMedio(p1,p2));
           // Punto pm= p1.puntoMedio(p2);
           // pm.dibujar(Color.red,0.02);
            pintarLinea(p1,p2);
            p1.dibujar(Color.green,0.03); 
            p2.dibujar(Color.BLUE,0.03);
            double d=p1.distancia(p2);
            StdDraw.text(pm.getX(), pm.getY(), String.valueOf(Math.round(d)));
            xRaton=Math.round(xRaton);
            yRaton=Math.round(yRaton);
            boolean pulsado=StdDraw.isMousePressed();
            StdDraw.text(xRaton,yRaton-15,"("+ xRaton+" , "+yRaton+")"+" "+pulsado);
            StdDraw.show();
            //StdDraw.pause(50);
		}    
	}


	private static void pintarLinea(Punto p1, Punto p2) {
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.line(p1.getX(), p1.getY(), p2.getX(), p2.getY());		
	}


	private static void pintarEjes() {
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int i = -100; i <= 95; i=i+3) {
			StdDraw.line(i, 0, i+2, 0);
			StdDraw.line(0, i, 0, i+2);
		}
		StdDraw.text(95, -4, "X");
		StdDraw.text(2.5, 95, "Y");
	}

}
