package ejerciciosListas;

import java.util.ArrayList;
import java.util.List;

import utilidades.Entrada;

public class Ejercicio3 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduzca "+(5-i)+" números más: ");
			al.add(Entrada.entero());
		}
		al.sort(null);
		for (Integer n : al) {
			System.out.println(n);
		}
	}

}
