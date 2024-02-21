package objetos;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import utilidades.StdDraw;

public class Reloj_Digital {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("EEEE  dd' de 'MMMM' de 'yyyy");
		SimpleDateFormat sdf2= new SimpleDateFormat("HH:mm:ss");
		Font f=new Font("Arial",0,30);
		StdDraw.setFont(f);
		StdDraw.enableDoubleBuffering();
		do {
			Date fecha= new Date();
			StdDraw.clear(Color.LIGHT_GRAY);
			StdDraw.setPenColor(Color.black);
			StdDraw.text(0, 15, sdf.format(fecha));
			StdDraw.setPenColor(Color.red);
			StdDraw.text(0, -10, sdf2.format(fecha));
			
			StdDraw.show();
		} while (true);
		
		
	}

}
