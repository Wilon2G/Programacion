package algoritmos;

import utilidades.Entrada;

public class EjercicioTraducción {

	public static void main(String[] args) {

		int opp=0;
		do {
			mostrarmenu();
			opp=Entrada.entero();
			switch (opp) {
			case 1:
				opciontraducirIngEsp();
				break;
			case 2:
				opciontraducirEspIng();
				break;
			case 3:
				opciontraducirEspAle();
				break;
			case 4:
				opciontraducirEspIta();
				break;
			case 0:
				System.out.println("Hasta la próxima :)");
				break;

			default:
				System.out.println("Error, las opciones son 1, 2, 0");
				break;
			}
			
			System.out.println("");
			
		} while (opp!=0);		
	}
	
	private static void opciontraducirEspIta() {
		String [] diccEsp= {"oso","cabra","patata","cebolla","gato"};
		String [] diccItaliano= {"orso","capra","Patata","cipolla","gatto"};
		System.out.println("Introduzca la palabra en Español:");
		String busco=Entrada.cadena();
		int index=indexOf(diccEsp,busco);
		if (index>=0) {
			System.out.println(busco+" se traduce a: "+diccItaliano[index]);
		} else {
			System.out.println("Palabra no encontrada en el diccionario");
		}		
	}
	
	private static void opciontraducirEspAle() {
		String [] diccEsp= {"oso","cabra","patata","cebolla","gato"};
		String [] diccAleman= {"tragen","Ziege","Kartoffel","Zwiebel","Katze"};
		System.out.println("Introduzca la palabra en Español:");
		String busco=Entrada.cadena();
		int index=indexOf(diccEsp,busco);
		if (index>=0) {
			System.out.println(busco+" se traduce a: "+diccAleman[index]);
		} else {
			System.out.println("Palabra no encontrada en el diccionario");
		}		
	}
	
	private static void mostrarmenu() {
		System.out.println("Elija una opción:");
		System.out.println("1- Inglés a Español");
		System.out.println("2- Español a Inglés");
		System.out.println("3- Español a Alemán");
		System.out.println("4- Español a Italiano");
		System.out.println("0- Salir");		
	}
	
	private static void opciontraducirEspIng() {
		String [] diccEsp= {"oso","cabra","patata","cebolla","gato"};
		String[] Den= {"bear","goat","potato","onion","cat"};
		System.out.println("Introduzca la palabra en Español:");
		String busco=Entrada.cadena();
		int index=indexOf(diccEsp,busco);
		if (index>=0) {
			System.out.println(busco+" se traduce a: "+Den[index]);
		} else {
			System.out.println("Palabra no encontrada en el diccionario");
		}
	}
	
	private static void opciontraducirIngEsp() {
		String [] diccEsp= {"oso","cabra","patata","cebolla","gato"};
		String[] Den= {"bear","goat","potato","onion","cat"};
		System.out.println("Introduzca la palabra en Inglés:");
		String busco=Entrada.cadena();
		int index=indexOf(Den,busco);
		if (index>=0) {
			System.out.println(busco+" se traduce a: "+diccEsp[index]);
		} else {
			System.out.println("Palabra no encontrada en el diccionario");
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
