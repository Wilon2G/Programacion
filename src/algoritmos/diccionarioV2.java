package algoritmos;

import utilidades.Entrada;

public class diccionarioV2 {

	public static void main(String[] args) {
		String busco;
		int opp=0;
		do {
			mostrarmenu();
			opp=Entrada.entero();
			switch (opp) {
			case 1:
				System.out.println("Introduzca el idioma del que traduce:");
				String idiom1=Entrada.cadena();
				System.out.println("Introduzca el idioma al que traduce:");
				String idiom2=Entrada.cadena();
				System.out.println("Introduzca la palabra que busca:");
				busco=Entrada.cadena();
				traducir(idiom1,idiom2,busco);
				break;
			case 2:
				mostrarDicc();
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
	private static void mostrarDicc() {
		String [] diccEsp= {"oso","cabra","patata","cebolla","gato"};
		String [] diccItaliano= {"orso","capra","Patata","cipolla","gatto"};
		String [] diccAleman= {"tragen","Ziege","Kartoffel","Zwiebel","Katze"};
		String[] Den= {"bear","goat","potato","onion","cat"};
		System.out.println("ESPAÑOL:");
		for (int i = 0; i < diccEsp.length; i++) {
			System.out.print(diccEsp[i]);
			if (i< diccEsp.length -1) {
				System.out.print(",");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("ITALIANO:");
		for (int i = 0; i < diccItaliano.length; i++) {
			System.out.print(diccItaliano[i]);
			if (i< diccItaliano.length -1) {
				System.out.print(",");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("INGLÉS:");
		for (int i = 0; i < Den.length; i++) {
			System.out.print(Den[i]);
			if (i< Den.length -1) {
				System.out.print(",");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("ALEMÁN:");
		for (int i = 0; i < diccAleman.length; i++) {
			System.out.print(diccAleman[i]);
			if (i< diccAleman.length -1) {
				System.out.print(",");
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	
	private static void traducir(String idiom1, String idiom2, String busco) {
		String [] diccEsp= {"oso","cabra","patata","cebolla","gato"};
		String [] diccItaliano= {"orso","capra","Patata","cipolla","gatto"};
		String [] diccAleman= {"tragen","Ziege","Kartoffel","Zwiebel","Katze"};
		String[] Den= {"bear","goat","potato","onion","cat"};
		switch (idiom1) {
		case "español":
			int i=indexOf(diccEsp,busco);
			if (i==-1) {
				System.out.println("Palabra no encontrada");
				break;
			} else {
				traducira(idiom2,busco,i);
			}
			break;
			
		case "ingles":
			i=indexOf(Den,busco);
			if (i==-1) {
				System.out.println("Palabra no encontrada");
				break;
			} else {
				traducira(idiom2,busco,i);
			}
			break;
			
		case "aleman":
			i=indexOf(diccAleman,busco);
			if (i==-1) {
				System.out.println("Palabra no encontrada");
				break;
			} else {
				traducira(idiom2,busco,i);
			}
			break;
			
		case "italiano":
			i=indexOf(diccItaliano,busco);
			if (i==-1) {
				System.out.println("Palabra no encontrada");
				break;
			} else {
				traducira(idiom2,busco,i);
			}
			break;
			
		default:
			break;
		}
		
	}
	
	
	private static void traducira(String idiom2, String busco, int i) {
		String [] diccEsp= {"oso","cabra","patata","cebolla","gato"};
		String [] diccItaliano= {"orso","capra","Patata","cipolla","gatto"};
		String [] diccAleman= {"tragen","Ziege","Kartoffel","Zwiebel","Katze"};
		String[] Den= {"bear","goat","potato","onion","cat"};
		switch (idiom2) {
		case "español":
			System.out.println(busco+" Se traduce a: "+diccEsp[i]);
			break;
		case "ingles":
			System.out.println(busco+" Se traduce a: "+Den[i]);
			break;
		case "aleman":
			System.out.println(busco+" Se traduce a: "+diccAleman[i]);
			break;
		case "italiano":
			System.out.println(busco+" Se traduce a: "+diccItaliano[i]);
			break;
		default:
			break;
		}
	}
	
	
	private static void mostrarmenu() {
		System.out.println("Elija una opción:");
		System.out.println("1- Traducción personalizada");
		System.out.println("2- Ver diccionarios");
		System.out.println("0- Salir");		
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
