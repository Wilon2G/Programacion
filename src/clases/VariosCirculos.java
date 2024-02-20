package clases;

import java.awt.Color;

import java.util.Random;

import utilidades.StdDraw;

public class VariosCirculos {
	static final int ESQUINA_SUPERIOR_IZQUIERDA = 1;
	static final int ESQUINA_SUPERIOR_DERECHA = 2;
	static final int ESQUINA_INFERIOR_IZQUIERDA = 3;
	static final int ESQUINA_INFERIOR_DERECHA = 4;

	public static void main(String[] args) {
		Random r = new Random();

		long ini = System.currentTimeMillis();

		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);

		Circulo[] a = new Circulo[5];

		for (int i = 0; i < a.length; i++) {
			double n = r.nextDouble(3, 15);
			a[i] = new Circulo(new Punto(-100 + n + 40 * i, 100 - n, coloRandom()), n);
			a[i].cambiarTrayectoria(r.nextDouble(0.1, 0.5), 0);
		}

		boolean desaparicionActivada = false;

		int cuentaAtras = 5;
		
		int nullcounter=0;
		

		StdDraw.enableDoubleBuffering();
		do {
			StdDraw.clear();
			if (nullcounter>=4) {
				StdDraw.pause(500);
				StdDraw.text(0, 0, "fin :)");
				for (int i = 0; i < a.length; i++) {
					if(a[i]!=null) {
						a[i].setCentro(new Punto(0,-20,a[i].getColor()));
						a[i].dibujar();
						StdDraw.text(0, -25-a[i].getRadio(), "Ganador!");
						StdDraw.setPenColor(Color.black);
						
						StdDraw.text(0, -35-a[i].getRadio(), "Completado en: "+(System.currentTimeMillis() - ini) / 1000);
						
					}
				}
			}
			else {
				if (!desaparicionActivada) {
					long current = System.currentTimeMillis();
					long t = (current - ini) / 1000;
					int c = cuentaAtras - (int) t;
					StdDraw.text(0, 0, String.valueOf(c));
					
					desaparicionActivada=c<=0;
				}
				else {
					StdDraw.setPenColor(Color.black);
					StdDraw.text(0, 0, "COMIENZA LA CAZA!!! ");
					StdDraw.text(0, -8, "Círculos Restantes: "+(5-nullcounter));
					for (int i = 0; i < a.length; i++) {
						if(a[i]!=null) {
							a[i].dibujar();
							a[i].mover();
							detectar(a[i]);
			
						}
					}
					for (int i = 0; i < a.length-1; i++) {
						for (int j = i+1; j < a.length; j++) {
							if (a[i]!=null&&a[j]!=null) {
								nullcounter= nullcounter+choque(a,j,i);
								
							}
							
						}
					}
			}
			
				
				
			}
			
			

			StdDraw.show();
		} while (true);
	}

	private static int choque(Circulo[] a, int j, int i) {
		int nulls=0;
		if (a[i].seSuperpone(a[j])) {
			a[i]=null;
			a[j]=null;
			nulls =nulls+2;
		}
		return nulls;
	}

	private static Color coloRandom() {
		Random r = new Random();
		return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}

	private static void detectar(Circulo c) {
		int esquina = estaEnEsquina(c);
		Random r = new Random();
		switch (esquina) {
		case ESQUINA_INFERIOR_IZQUIERDA:
			c.setCentro(new Punto(-100 + c.getRadio(), -100 + c.getRadio(), c.getColor()));
			c.cambiarTrayectoria(0, r.nextDouble(0.1, 0.3));
			break;
		case ESQUINA_INFERIOR_DERECHA:
			c.setCentro(new Punto(100 - c.getRadio(), -100 + c.getRadio(), c.getColor()));
			c.cambiarTrayectoria(-r.nextDouble(0.1, 0.3), 0);
			break;
		case ESQUINA_SUPERIOR_DERECHA:
			c.setCentro(new Punto(100 - c.getRadio(), 100 - c.getRadio(), c.getColor()));
			c.cambiarTrayectoria(0, -r.nextDouble(0.1, 0.3));
			break;
		case ESQUINA_SUPERIOR_IZQUIERDA:
			c.setCentro(new Punto(-100 + c.getRadio(), 100 - c.getRadio(), c.getColor()));
			c.cambiarTrayectoria(r.nextDouble(0.1, 0.3), 0);
			break;

		default:
			break;
		}

	}

	private static int estaEnEsquina(Circulo c) {
		Punto vii = new Punto(-100, -100); // Inf Izq
		Punto vid = new Punto(100, -100); // Inf Der
		Punto vsd = new Punto(100, 100); // Sup Der
		Punto vsi = new Punto(-100, 100); // Sup Izq
		if (Math.pow(c.getCentro().distancia(vii), 2)
				- 0.0001 <= (Math.pow(c.getRadio(), 2) + Math.pow(c.getRadio(), 2))) {
			return ESQUINA_INFERIOR_IZQUIERDA;
		}
		if (Math.pow(c.getCentro().distancia(vid), 2)
				- 0.0001 <= (Math.pow(c.getRadio(), 2) + Math.pow(c.getRadio(), 2))) {
			return ESQUINA_INFERIOR_DERECHA;
		}
		if (Math.pow(c.getCentro().distancia(vsd), 2)
				- 0.0001 <= (Math.pow(c.getRadio(), 2) + Math.pow(c.getRadio(), 2))) {
			return ESQUINA_SUPERIOR_DERECHA;
		}
		if (Math.pow(c.getCentro().distancia(vsi), 2)
				- 0.0001 <= (Math.pow(c.getRadio(), 2) + Math.pow(c.getRadio(), 2))) {
			return ESQUINA_SUPERIOR_IZQUIERDA;
		} else {
			return -1;
		}

	}
}
