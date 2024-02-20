package clases;

import utilidades.Entrada;

public class ExpresionesRegularesPruebas {

	public static void main(String[] args) {
		do {
			String t=Entrada.cadena();
			if (t.matches("[+-]?[0-9]+([.,][0-9]+)?[$€]")) {
				System.out.println("numero");
			}
			if (t.matches(".*mar.*")) {
				System.out.println("marrrr");
			}
			if (t.matches("[0-9]{8}[A-Z]{1}")) {
				System.out.println("dni");
			}
		} while (true);
		
	}

}
