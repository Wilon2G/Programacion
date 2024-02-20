package clases;

import java.awt.Color;
import java.util.Random;

import utilidades.StdDraw;

public class ArrayDeCirculosPersiguiendose {
		static final int ESQUINA_SUPERIOR_IZQUIERDA=1;
		static final int ESQUINA_SUPERIOR_DERECHA=2;
		static final int ESQUINA_INFERIOR_IZQUIERDA=3;
		static final int ESQUINA_INFERIOR_DERECHA=4;
		static final int NO_ESQUINA=0;
		
		
		
public static void main(String[] args) {
	    	
	    	
	    	
	    	StdDraw.setXscale(-100,100);
			StdDraw.setYscale(-100,100);
			
			Random r=new Random();
			
			
			Circulo [] a=new Circulo[8];
			for (int i = 0; i < a.length; i++) {
				double radio=r.nextDouble(3, 15);
				int velocidad=r.nextInt(1,15);
				a[i]=new Circulo(-100+radio,100-radio,radio);
				//Generamos color aleatorio
				Color c=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
				a[i].getCentro().setColor(c);
				a[i].movimiento(velocidad,0);
			}
			
			
			StdDraw.enableDoubleBuffering();
			
			boolean salir=false;
			boolean desaparicionActivada=false;
			
			long tiempoInicial=System.currentTimeMillis();
			int cuentaAtrasInicial=5;
			while (!salir) {
				//Borrar contenido ventana
				StdDraw.clear();
				//Dibujar elementos (no se muestran hasta show)
				//pintarEjes();
				
				if (!desaparicionActivada) {
					long tiempoActual=System.currentTimeMillis();
					long segundosTranscurridos=(tiempoActual-tiempoInicial)/1000;
					int cuentaAtrasActual=cuentaAtrasInicial-(int)segundosTranscurridos;
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.text(0, 0, String.valueOf(cuentaAtrasActual));
					desaparicionActivada=cuentaAtrasActual<=0;
				}
				else {
					StdDraw.setPenColor(Color.BLUE);
					StdDraw.text(0, 0,"¡¡ Comienza la caza !!");
				}
					
				
				
				//Dibujamos y movemos círculos
				for (int i = 0; i < a.length; i++) {
					if (a[i]!=null)
						a[i].dibujar();
				}
				
				
				for (int i = 0; i < a.length; i++) {
					if (a[i]!=null)
						a[i].mover();
				}
				
				//Modificamos movimiento si estamos en alguna esquina
				for (int i = 0; i < a.length; i++) {
					if (a[i]!=null) {
						int situacion=estaEnESquina(a[i]);
						if (situacion!=NO_ESQUINA)
							cambiarTrayectoria(a[i],situacion,tiempoInicial);
					}
				}
				
				
				
				//Comprobamos si los círculos se superponen
				if (desaparicionActivada) {
					for (int i = 0; i < a.length-1; i++) {
						for (int j = i+1; j < a.length; j++) {
							//Comprobamos superposición si ambos círculos existen (no son null)
							if (a[i]!=null && a[j]!=null) {
								if (a[i].seSuperpone(a[j])) {
									a[i]=null;
									a[j]=null;
								}
							}
						}
					}
				}
				
				salir=noQuedanCirculos(a);
				
				//Mostrar lo dibujado
			    StdDraw.show();
			    //Esperar un tiempo para que el usuario vea el contenido
			    StdDraw.pause(50);
			}
			
			StdDraw.clear();
			StdDraw.setPenColor(Color.RED);
			StdDraw.text(0, 0, "¡¡ Caza finalizada !!");
			StdDraw.show();
			StdDraw.pause(5000);
			System.exit(0);
	        
	    }
	    
	    
		private static boolean noQuedanCirculos(Circulo[] a) {
			for (int i = 0; i < a.length; i++) {
				if (a[i]!=null)
					return false;
			}
			return true;
		}


		private static void cambiarTrayectoria(Circulo c, int situacion, long tiempoInicial) {
			Random r=new Random();
			switch (situacion) {
			case ESQUINA_SUPERIOR_DERECHA:
				if (System.currentTimeMillis()-tiempoInicial>5000) {
					c.movimiento(0,-c.getCentro().getMovX()-r.nextDouble(5,15));
				}
				c.movimiento(0,-c.getCentro().getMovX());
				//Recolocamos 
				c.getCentro().setX(100-c.getRadio());
				c.getCentro().setY(100-c.getRadio());
				break;
			case ESQUINA_INFERIOR_DERECHA:
				c.movimiento(c.getCentro().getMovY(),0);
				c.getCentro().setX(100-c.getRadio());
				c.getCentro().setY(-100+c.getRadio());
				break;
			case ESQUINA_INFERIOR_IZQUIERDA:
				c.movimiento(0,-c.getCentro().getMovX());
				c.getCentro().setX(-100+c.getRadio());
				c.getCentro().setY(-100+c.getRadio());
				break;
			case ESQUINA_SUPERIOR_IZQUIERDA:
				c.movimiento(c.getCentro().getMovY(),0);
				c.getCentro().setX(-100+c.getRadio());
				c.getCentro().setY(100-c.getRadio());
				break;
			}
			
		}


		private static int  estaEnESquina(Circulo c) {
			Punto derecha=new Punto(100,100-c.getRadio());
			if (c.getCentro().distancia(derecha) < c.getRadio())
				return ESQUINA_SUPERIOR_DERECHA;
			Punto abajo=new Punto(100-c.getRadio(),-100);
			if (c.getCentro().distancia(abajo) < c.getRadio())
				return ESQUINA_INFERIOR_DERECHA;
			Punto izquierda=new Punto(-100,-100+c.getRadio());
			if (c.getCentro().distancia(izquierda) < c.getRadio())
				return ESQUINA_INFERIOR_IZQUIERDA;
			Punto arriba=new Punto(-100+c.getRadio(),100);
			if (c.getCentro().distancia(arriba) < c.getRadio())
				return ESQUINA_SUPERIOR_IZQUIERDA;
			
			return NO_ESQUINA;
		}


		public static void pintarEjes() {
			// Ejes
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setPenRadius(0.003);
			StdDraw.line(0, -100, 0, 100);
			StdDraw.text(2, 98, "y");
			StdDraw.line(-100, 0, 100, 0);
			StdDraw.text(98, 2, "x");
		}
	}

