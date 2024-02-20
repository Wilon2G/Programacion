package clases;

import java.util.Iterator;

import utilidades.Entrada;

public class ValidarDocumento {

	public static void main(String[] args) {
		do {
			System.out.print("Introduzca número de documento: ");
			String doc=Entrada.cadena();
			doc= validarDocumento(doc);
			
			if (doc==null) {
				System.out.println("Documento inválido");
			}
			else {
				System.out.println(doc);
				System.out.println("Documento válido");
			}
			
		} while (true);
		
	}

	private static String validarDocumento(String doc) {
		String[] letras = {"T","R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		String letra;
		double resto;
		if (doc==null) {
			return null;
		}
		doc=doc.trim().toUpperCase();
		if (doc.length()>9) {
			return null;
		}
		if (doc.matches("[0-9]?[0-9]{7}[A-Z]")) {
			while (doc.length()<9) {
				doc="0"+doc;
			}
			
			letra=doc.substring(8,9);
			resto=Integer.valueOf(doc.substring(0,8))%23;
			
			if (letras[(int)resto].equals(letra)) {
				return doc;
			}
			return null;
			
		}
		else {
			if (doc.matches("[X-Z][0-9]{7}[A-Z]")) {
				String letraNie=doc.substring(0,1);
				switch (letraNie) {
				case "X":
					doc="0"+doc.substring(1,9);
					break;
				case "Y":
					doc="1"+doc.substring(1,9);
					break;
				case "Z":
					doc="2"+doc.substring(1,9);
					break;
				default:
					return null;
				}
				
				letra=doc.substring(8,9);
				resto=Integer.valueOf(doc.substring(0,8))%23;
				
				if (letras[(int)resto].equals(letra)) {
					return letraNie+doc.substring(1,9);
				}
				else {
					return null;
				}
			}
			else {
				if (doc.matches("[A-HJ-NP-SU-W][0-9]{7}[A-J0-9]")) {
					doc=validarCif(doc);
					return doc;
				}
				if (doc.matches("[0-9]{4}[-]?[B-DF-HJ-NP-TV-Z]{3}")) {
					if (doc.length()>7) {
						doc=doc.substring(0,4)+doc.substring(5,8);
					}
					return "Matricula: "+doc;
				}
				return null;
			}
		}		
	}

	private static String validarCif(String doc) {
		char claveEntidad=doc.charAt(0);
		String control=doc.substring(8,9);
		int pares=0;
		int impares;
		int[] nums= new int[7];
		for (int i = 0; i < nums.length; i++) {
			nums[i]= Integer.valueOf(doc.substring(i+1,i+2));
		}
		for (int i = 0; i < nums.length; i++) {
			if (i%2==0) {
				
			}
			else {
				pares+=nums[i];
			}
		}
		
		
		return control;
	}
	
	
	
	
}
