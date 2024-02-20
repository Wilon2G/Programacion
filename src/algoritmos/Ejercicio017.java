package algoritmos;

import utilidades.Entrada;

public class Ejercicio017 {

	public static void main(String[] args) {
		int n1,n2,op;
		do {
			System.out.println("Introduzca dos números:");
			n1=Entrada.entero();
			n2=Entrada.entero();
			System.out.println("¿Qué operación desea?");
			System.out.println("1- SUMA");
			System.out.println("2- RESTA");
			System.out.println("3- MULTIPLICACIÓN");
			System.out.println("4- DIVISIÓN");
			op=Entrada.entero();
			switch (op) {
			case 1:
				System.out.println(n1+" + "+n2+" = "+(n1+n2));
				break;
			case 2:
				System.out.println(n1+" - "+n2+" = "+(n1-n2));
				break;
			case 3:
				System.out.println(n1+" x "+n2+" = "+(n1*n2));
				break;
			case 4:
				System.out.println(n1+" / "+n2+" = "+(n1/n2));
				break;
			case 0:
				System.out.println("Hasta pronto:)");
				break;
			default:
				System.out.println("Ha introducido "+n1+" y "+n2);
			}
			System.out.println(" ");
			
		} while (op!=0);
		
	}

}
