package clases;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utilidades.StdDraw;

public class DetectarClick {
	static boolean recienPulsado=false;
	
	static final int CUADRANTE_SUPERIOR_IZQUIERDO=1;
	static final int CUADRANTE_SUPERIOR_DERECHO=2;
	static final int CUADRANTE_INFERIOR_DERECHO=3;
	static final int CUADRANTE_INFERIOR_IZQUIERDO=4;
	static final int SIN_CUADRANTE=0;

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		
		List<Circulo> circulos = generarCirculos();
		int opp=1;
		int dir=-1;
		boolean gameOn=true;
		double angulo=0.3;
		long Tfin= System.currentTimeMillis();
		long tIn = System.currentTimeMillis();
		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			
			if (gameOn) {
				pintarCuadrantes();
				pintarEjes();
				Tfin = System.currentTimeMillis();
			}
			
			switch (opp) {
			case 1:
				dibujarCirculos(circulos);
				break;
			case 2:
				dibujarCirculos(circulos);
				rotarCirculos(circulos,dir,angulo);
				break;
			
			case 0:
				System.exit(0);
				
			default:
				break;
			}
			
			
		
			
			if (clickRaton()) {
				boolean circuloEliminado=false;
				Punto PosRaton=new Punto(StdDraw.mouseX(),StdDraw.mouseY());
				
				for (int i = 0; i < circulos.size(); i++) {
					Circulo c=circulos.get(i);
					if (PosRaton.dentroDeCirculo(circulos.get(i))) {
						circulos.remove(c);
						circuloEliminado=true;
					}
				}
				if (!circuloEliminado) {
					switch (detectarCuadrante(StdDraw.mouseX(),StdDraw.mouseY())) {
					case 1:
						System.out.println("Cuadrante Superior Izquierdo");
						opp=1;
						break;
					case 2:
						System.out.println("Cuadrante Superior Derecho");
						opp=2;
						break;
					case 3:
						System.out.println("Cuadrante Inferior Derecho");
						dir=-dir;
						break;
					case 4:
						System.out.println("Cuadrante Inferior Izquierdo");
						opp=0;
						break;
					case 0:
						System.out.println("En el Eje");

					default:
						break;
					}
				}
				
			}
			
			if (circulos.size()==0) {
				gameOn=false;
				StdDraw.clear(Color.LIGHT_GRAY);
				StdDraw.setPenColor(Color.black);
				StdDraw.text(0, 0, "Game Over");
				int tiempo=(int)( Tfin-tIn  )/1000;
				StdDraw.text(0, -10, "Terminado en: "+tiempo+" s");
			}
			
			StdDraw.show();
		} while (true);
	}

	
	private static void rotarCirculos(List<Circulo> circulos, int i, double angulo) {
		if (i>0) {
			for (Circulo circulo : circulos) {
				circulo.rotar(angulo);
			}
		}
		else {
			for (Circulo circulo : circulos) {
				circulo.rotar(-angulo);
			}
		}
		
	}


	private static List<Circulo> generarCirculos() {
		List<Circulo> circulos = new ArrayList<Circulo>();
		int cnt=0;
		int cnt2=0;
		for (int i = 0; i < 11; i++) {
			circulos.add(new Circulo(0,0+cnt+cnt2,5));
			if (i<5) {
				cnt+=15;
			}
			else {
				cnt=0;
				cnt2+=-15;
			}
			
		}
		
		return circulos;
		
	}


	private static void dibujarCirculos(List<Circulo> circulos) {
		for (Circulo circulo : circulos) {
			circulo.dibujar();
		}
	}


	private static void pintarCuadrantes() {
		StdDraw.setPenColor(Color.red);
		StdDraw.filledSquare(-50, 50, 50);
		StdDraw.setPenColor(Color.green);
		StdDraw.filledSquare(50, 50, 50);
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledSquare(50, -50, 50);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledSquare(-50, -50, 50);
		StdDraw.setPenColor(Color.black);
		StdDraw.text(-50, 50, "PAUSA");
		StdDraw.text(50, 50, "ARRANCAR");
		StdDraw.text(50, -50, "ALTERNAR GIRO");
		StdDraw.text(-50, -50, "SALIR");
	}


	private static int detectarCuadrante(double mouseX, double mouseY) {
		if (mouseX<0&&mouseY>0) {
			return CUADRANTE_SUPERIOR_IZQUIERDO;
		}
		if (mouseX>0&&mouseY>0) {
			return CUADRANTE_SUPERIOR_DERECHO;
		}
		if (mouseX>0&&mouseY<0) {
			return CUADRANTE_INFERIOR_DERECHO;
		}
		if (mouseX<0&&mouseY<0) {
			return CUADRANTE_INFERIOR_IZQUIERDO;
		}
		return 0;
	}


	private static boolean clickRaton() {
		if (StdDraw.isMousePressed()) {
			if (!recienPulsado) {
				recienPulsado = true;
				return true;
			}
		}
		else {
			recienPulsado = false;
		}
		
		return false;
	}
	
	private static void pintarEjes() {
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.BLACK);
		for (int i = -100; i <= 95; i = i + 3) {
			StdDraw.line(i, 0, i + 2, 0);
			StdDraw.line(0, i, 0, i + 2);
		}
		StdDraw.text(95, -4, "X");
		StdDraw.text(2.5, 95, "Y");
	}
	
	
}
