package cuatro_en_raya;

import java.awt.Color;

import clases.Circulo;
import clases.Punto;
import objetos.Rectangulo;
import utilidades.StdDraw;

public class Juego {
	// seis filas, siete columnas
	static Circulo[][] fichasTablero;
	static final double TAM_CASILLAS = 25;
	static Rectangulo tablero;

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);

		tablero = new Rectangulo(new Punto(-88, 70), TAM_CASILLAS * 7, TAM_CASILLAS * 6);
		tablero.color(Color.blue);
		fichasTablero = new Circulo[6][7];
		

		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			tablero.color(Color.blue);
			tablero.dibujar();
			dibujarFichas(fichasTablero);
			
			marcarColumna(StdDraw.mouseX(),StdDraw.mouseY());

			StdDraw.show();
		} while (true);

	}

	private static void marcarColumna(double mosX, double mosY) {
		Rectangulo marca=new Rectangulo(tablero.getSupIzq(),TAM_CASILLAS,tablero.getSupIzq().getY()-tablero.getInfDer().getY());
		marca.color(Color.GRAY);
		marca.dibujar(false);
		if (mosX>tablero.getSupIzq().getX()&&mosX<(tablero.getSupIzq().getX()+TAM_CASILLAS)) {
			
			
		}
	}

	private static void dibujarFichas(Circulo[][] fichasTablero) {
		Circulo vacio= new Circulo(0,0,TAM_CASILLAS * 0.8 / 2);
		
		for (int i = 0; i < fichasTablero.length; i++) {
			for (int j = 0; j < fichasTablero[i].length; j++) {
				
				if (fichasTablero[i][j]==null) {
					vacio.setCentro(new Punto(tablero.getSupIzq().getX() + TAM_CASILLAS * j + TAM_CASILLAS / 2,tablero.getSupIzq().getY() - TAM_CASILLAS / 2 - TAM_CASILLAS * i));
					vacio.setColor(Color.white);
					vacio.dibujar();
				}
				else {
					fichasTablero[i][j].dibujar();
				}
			}
		}

	}

	

}
