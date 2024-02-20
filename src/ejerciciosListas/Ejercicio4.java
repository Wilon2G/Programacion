package ejerciciosListas;

import java.util.ArrayList;
import java.util.List;

import utilidades.Entrada;

public class Ejercicio4 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduzca " + (5 - i) + " palabras más: ");
			al.add(Entrada.cadena());
		}
		al.sort(null);
		for (String t : al) {
			System.out.println(t);
		}

		for (int i = 0; i < al.size(); i++) {
			for (int j = 0;al.get(i)!=null && j < al.get(i).length(); j++) {
				if (al.get(i) != null) {
					if (al.get(i).charAt(j) == 'm' || al.get(i).charAt(j) == 'M') {
						al.set(i, null);
					}
				}

			}

		}

		System.out.println("");

		for (String t : al) {
			if (t != null) {
				System.out.println(t);
			}

		}
	}

}
