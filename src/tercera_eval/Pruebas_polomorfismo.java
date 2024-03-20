package tercera_eval;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import objetos.Futbolista;
import objetos.Persona;
import objetos.Tenista;

public class Pruebas_polomorfismo {

	public static void main(String[] args) {
		List<Object> al = new ArrayList<Object>();
		al.add(new String("Hola mundo"));
		al.add(new Persona("72275397j", "jose", 2, "25/06/2020"));
		al.add(new Random());
		al.add(new Tenista("72275397j", "pepito", 1.3, "3/2/1812", 12, true));
		al.add(new Futbolista("72275397j", "pepe", 2, "2/1/2001", 5));
		for (Object ob : al) {
			if (ob.getClass().equals(String.class)) {
				String t=(String)ob;
				
			}
			if (ob.getClass().equals(Persona.class)) {

			}
			if (ob.getClass().equals(Random.class)) {

			}
			if (ob.getClass().equals(Tenista.class)) {

			}
			if (ob.getClass().equals(Futbolista.class)) {

			}
		}
	}

}
