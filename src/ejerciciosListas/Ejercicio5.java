package ejerciciosListas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

	public static void main(String[] args) {
		List<String> listDias = new ArrayList<String>();
		listDias.add("Lunes");
		listDias.add("Martes");
		listDias.add("Miércoles");
		listDias.add("Jueves");
		listDias.add("Viernes");
		listDias.add("Sábado");
		listDias.add("Domingo");
		
		listDias.add(4, "Juernes");
		
		List<String> listaDos = listDias;
		
		System.out.println(listDias.get(3)+","+listDias.get(4));
		
		System.out.println(listDias.get(0)+","+listDias.get(listDias.size()-1));
		System.out.println("");
		listDias.remove("Juernes");
		
		visualizarLista(listaDos);
		System.out.println("");
		
		if (listDias.indexOf("Lunes")!=-1) {
			System.out.println("Existe Lunes");
		}
		
		for (String t : listDias) {
			if (t.equalsIgnoreCase("lunes")) {
				
			}
		}
		
		listDias.sort(null);
		
		
	}

	private static void visualizarLista(List<String> al) {
		for (String t : al) {
			System.out.println(t);
		}
	}

}
