package clases;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import utilidades.StdDraw;

public class CirculoArrayList {
	static final Punto ESQUINA_SUPERIOR_DERECHA = new Punto(100, 100);
	static final Punto ESQUINA_INFERIOR_DERECHA = new Punto(100, 100);
	static final Punto ESQUINA_INFERIOR_IZQUIERDA = new Punto(100, 100);
	static final Punto ESQUINA_SUPERIOR_IZQUIERDA = new Punto(100, 100);
	static final Punto NO_ESQUINA = new Punto(0, 0);

	public static void main(String[] args) {
		Random r = new Random();
		List<Circulo> circulos = generarCirculos(10);
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);

		boolean cuentaATras = true;

		long tIn = System.currentTimeMillis();
		StdDraw.enableDoubleBuffering();
		while (quedanCirculos(circulos)) {
			StdDraw.clear();

			if (cuentaATras) {
				long tActual = System.currentTimeMillis();
				int cuenta = 5 - (int) (tActual - tIn) / 1000;
				StdDraw.setPenColor(Color.black);
				StdDraw.setPenRadius(5);
				StdDraw.text(0, 0, String.valueOf(cuenta));
				cuentaATras = cuenta >= 0;
			}

			moverYDibujar(circulos);

			detectarPosicion(circulos);

			StdDraw.show();
		}

	}

	private static void detectarPosicion(List<Circulo> circulos) {
		for (int i = 0; i < circulos.size(); i++) {
			int esquina = estaEsquina(circulos.get(i));
			cambiarTrayectoria(circulos.get(i), esquina);

		}
	}

	private static void cambiarTrayectoria(Circulo c, int esquina) {
		switch (esquina) {
		case 1:
			c.movimiento(0, -c.getCentro().getMovX());
			c.getCentro().setX(100-c.getRadio());
			c.getCentro().setY(100-c.getRadio());
			break;
		case 2:
			c.movimiento(c.getCentro().getMovY(),0);
			c.getCentro().setX(100-c.getRadio());
			c.getCentro().setY(-100+c.getRadio());
			break;
		case 3:
			c.movimiento(0,-c.getCentro().getMovX());
			c.getCentro().setX(-100+c.getRadio());
			c.getCentro().setY(-100+c.getRadio());
			break;
		case 4:
			c.movimiento(c.getCentro().getMovY(),0);
			c.getCentro().setX(-100+c.getRadio());
			c.getCentro().setY(100-c.getRadio());
			break;

		default:
			break;
		}
	}

	private static int estaEsquina(Circulo circulo) {
		if ((circulo.getCentro().getX() + circulo.getRadio()) == ESQUINA_SUPERIOR_DERECHA.getX()
				&& (circulo.getCentro().getY() + circulo.getRadio()) == ESQUINA_SUPERIOR_DERECHA.getY()) {
			return 1;
		}
		if ((circulo.getCentro().getX() + circulo.getRadio()) == ESQUINA_INFERIOR_DERECHA.getX()
				&& (circulo.getCentro().getY() - circulo.getRadio()) == ESQUINA_INFERIOR_DERECHA.getY()) {
			return 2;
		}
		if ((circulo.getCentro().getX() - circulo.getRadio()) == ESQUINA_INFERIOR_IZQUIERDA.getX()
				&& (circulo.getCentro().getY() - circulo.getRadio()) == ESQUINA_INFERIOR_IZQUIERDA.getY()) {
			return 3;
		}
		if ((circulo.getCentro().getX() + circulo.getRadio()) == ESQUINA_SUPERIOR_IZQUIERDA.getX()
				&& (circulo.getCentro().getY() + circulo.getRadio()) == ESQUINA_SUPERIOR_IZQUIERDA.getY()) {
			return 4;
		}
		return -1;
	}

	private static void moverYDibujar(List<Circulo> circulos) {
		for (int i = 0; i < circulos.size(); i++) {
			circulos.get(i).dibujar();
			circulos.get(i).mover();
		}
	}

	private static boolean quedanCirculos(List<Circulo> circulos) {
		return circulos.size() > 0;

	}

	private static List<Circulo> generarCirculos(int n) {
		Random r = new Random();
		List<Circulo> circulos = new ArrayList<Circulo>();
		for (int i = 0; i < n; i++) {
			double radio = r.nextDouble(3, 15);
			int velocidad = r.nextInt(1, 2);

			circulos.add(new Circulo(-100 + radio, 100 - radio, radio));

			Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			circulos.get(i).getCentro().setColor(c);
			circulos.get(i).movimiento(velocidad, 0);
		}
		return circulos;
	}

}
