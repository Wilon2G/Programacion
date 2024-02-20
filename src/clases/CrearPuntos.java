package clases;

import java.awt.Color;

public class CrearPuntos {

	public static void main(String[] args) {

		Punto p1,p2,p3,p4,p5;		//Referencias sin objeto asociado
		
		p1=new Punto(5,10,Color.green);		//Instancias (new) y constructores (Punto())
		p2=new Punto(7, 9, Color.yellow);		//Crea un objeto y lo liga a la referencia p1
		p3=new Punto(0, 3, Color.red);
		p4=new Punto(4, 7, Color.black);
		p5=new Punto(10, 12, Color.white);
		
		new Punto();	//Crear un objeto sin referencia, no se podrá utilizar
		
		
		Punto[] puntos= {p1,p2,p3,p4,p5};
		Punto[] puntos2=new Punto[5];
		
		for (int i = 0; i < puntos2.length; i++) {
			puntos2[i]=new Punto();
		}
		
		for (int i = 0; i < puntos.length; i++) {
			System.out.println(puntos[i]);
			System.out.println("");
		}
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);


	}

}
