package algoritmos;

import utilidades.Entrada;

public class BuscarArray {

	public static void main(String[] args) {
		String [] palabras= {"Pepe","Jose","Maria","Gato","Perro"};
		String busco;
		while (true) {
			System.out.println("Que buscas?");
			busco=Entrada.cadena();
			int index= indexOf(palabras,busco);
			if (index==-1) {
				System.out.println(busco+" No existe");
			} else {
				System.out.println(busco+" está en la posición número "+index);
			}
		}
	}

	private static int indexOf(String[] palabras,String busco) {
		int index=-1;
		for (int i = 0; i < palabras.length&&index==-1; i++) {
			if (palabras[i].equalsIgnoreCase(busco)) {
				index=i;
			}
		}		return index;
	}

}
