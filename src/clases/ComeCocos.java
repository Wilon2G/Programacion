package clases;

import java.awt.Color;

import utilidades.StdDraw;

public class ComeCocos {
double orientación=0;
double x=0;
double y=0;

public ComeCocos(double x, double y) {
	super();
	this.x = x;
	this.y = y;
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

public static void draw(ComeCocos c) {
	StdDraw.setPenColor(Color.yellow);
StdDraw.filledCircle(c.x, c.y, 3);
StdDraw.setPenColor(Color.black);
StdDraw.circle(c.x, c.y, 3);
}






}
