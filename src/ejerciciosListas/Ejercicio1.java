package ejerciciosListas;

import java.util.ArrayList;

import java.util.List;


public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Jose");
		al.add("Pepe");
		al.add("Carlos");
		
		for (String nombre : al) {
			System.out.println(nombre);
		}
	}

}
