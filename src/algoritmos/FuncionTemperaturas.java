package algoritmos;

import utilidades.Entrada;

public class FuncionTemperaturas {

	public static void main(String[] args) {
		while (true) {
			double t;
			String unidadf;
			String unidadi;
			System.out.println("Introduzca la temperatura:");
			t=Entrada.real();
			System.out.println("Introduzca la unidad C, K, F, R:");
			unidadi=Entrada.cadena();
			System.out.println("Introduzca la unidad a la que desee cambiar C, K, F, R:");
			unidadf=Entrada.cadena();
			System.out.println(convertirA(t,unidadi,unidadf));
		}

	}
	private static String convertirA (double t, String unidadi, String unidadf) {
		String tfinal;
		tfinal="sss";
		switch (unidadi) {
		case "C":
			switch (unidadf) {
			case "C":
				tfinal=t+" Grados Celsius son: "+t+" grados Celsius";
				break;
			case "K":
				tfinal=t+" Grados Celsius son: "+(t+273)+" Grados Kelvin";
				break;
			case "F":
				tfinal=t+" Grados Celsius son: "+((18*t/10)+32)+" grados Fahrenheit";
				break;
			case "R":
				tfinal=t+" Grados Celsius son: "+(8*t/10)+" grados Reamur";
				break;

			default:
				tfinal="Error, las opciones son: C, K, F, R ";
				break;
			}
			break;
			
		case "K":
			switch (unidadf) {
			case "C":
				tfinal=t+" Grados Kelvin son: "+(t-273)+" grados Celsius";
				break;
			case "K":
				tfinal=t+" Grados Kelvin son: "+t+" Grados Kelvin";
				break;
			case "F":
				tfinal=t+" Grados Kelvin son: "+((t-273)*(18/10)+32)+" grados Fahrenheit";
				break;
			case "R":
				tfinal=t+" Grados Kelvin son: "+80*((t-273)/100)+" grados Reamur";
				break;

			default:
				tfinal="Error, las opciones son: C, K, F, R ";
				break;
			}
			break;
			
		case "F":
			switch (unidadf) {
			case "C":
				tfinal=t+" Grados Fahrenheit son: "+(10/18)*(t-32)+" grados Celsius";
				break;
			case "K":
				tfinal=t+" Grados Fahrenheit son: "+((10/18)*(t-32)+273)+" Grados Kelvin";
				break;
			case "F":
				tfinal=t+" Grados Fahrenheit son: "+t+" grados Fahrenheit";
				break;
			case "R":
				tfinal=t+" Grados Fahrenheit son: "+((t-32)*8/18)+" grados Reamur";
				break;

			default:
				tfinal="Error, las opciones son: C, K, F, R ";
				break;
			}
			break;
			
		case "R":
			switch (unidadf) {
			case "C":
				tfinal=t+" Grados Reamur son: "+10*t/8+" grados Celsius";
				break;
			case "K":
				tfinal=t+" Grados Reamur son: "+((t*10/8)+273)+" Grados Kelvin";
				break;
			case "F":
				tfinal=t+" Grados Reamur son: "+((18*t/8)+32)+" grados Fahrenheit";
				break;
			case "R":
				tfinal=t+" Grados Reamur son: "+t+" grados Reamur";
				break;

			default:
				tfinal="Error, las opciones son: C, K, F, R ";
				break;
			}
			break;
			
		default:
			break;
		}
		
		
		return tfinal;
		
	}
	
	
	
	
	
	

}
