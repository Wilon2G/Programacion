package algoritmos;

import utilidades.Entrada;

public class Frutas {

	public static void main(String[] args) {
		String[] frutas= {"pera","fresa","manzana","melon"};
		boolean fruta=false;
		String t= Entrada.cadena().toLowerCase(),sol="";
		
		for (int i = 0; i < frutas.length; i++) {
			if (t.indexOf(frutas[i])>=0) {
				sol=sol+","+frutas[i];
				fruta=true;
			}
		}
		if (fruta) {
			System.out.println("Tiene estas frutas: "+sol);
		} else {
			System.out.println("No hay fruta");
		}
	}

}
