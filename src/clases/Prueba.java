package clases;

import java.awt.Color;

import utilidades.StdDraw;

public class Prueba {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		boolean c1=true;
		
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear(Color.green);
			if (c1) {
				rectangulorojo();
			}
			c1=false;
			
			
			StdDraw.setPenRadius(0.005);
			StdDraw.rectangle(0, -20, 30, 10);
			StdDraw.text(0, -20, "START");
			if (StdDraw.isMousePressed()&&(StdDraw.mouseX()>-30)&&(StdDraw.mouseX()<30)&&(StdDraw.mouseY()<-10)&&(StdDraw.mouseY()>-30)) {
				c1=true;
				StdDraw.pause(100);
			}
			
			StdDraw.show();
		} while (true);
	}

	private static void rectangulorojo() {
		boolean c2=true;
		do {
			StdDraw.clear(Color.LIGHT_GRAY);
			
			StdDraw.setPenRadius(0.005);
			StdDraw.rectangle(0, -20, 30, 10);
			StdDraw.text(0, -20, "START");
			if (StdDraw.isMousePressed()&&(StdDraw.mouseX()>-30)&&(StdDraw.mouseX()<30)&&(StdDraw.mouseY()<-10)&&(StdDraw.mouseY()>-30)) {
				c2=false;
				StdDraw.pause(100);
			}
			
			
			StdDraw.show();
		} while (c2);
	}

}
