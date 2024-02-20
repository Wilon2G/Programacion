package algoritmos;

import utilidades.Entrada;

public class SustituirA_X {

	public static void main(String[] args) {
		String t= Entrada.cadena();
		
		{
			
		}
		
		String sol="";
		for (int i = 0; i < t.length(); i++) {
			switch (t.charAt(i)) {
			case 'á':
				sol=sol+'a';
				break;
			case 'Á':
				sol=sol+'A';
				break;
			case 'é':
				sol=sol+'e';
				break;
				
			case 'É':
				sol=sol+'E';
				break;
			case 'í':
				sol=sol+'i';
				break;
			case 'Í':
				sol=sol+'I';
				break;
			case 'ó':
				sol=sol+'o';
				break;
			case 'Ó':
				sol=sol+'O';
				break;
			case 'ú':
				sol=sol+'u';
				break;
			case 'Ú':
				sol=sol+'U';
				break;
			case 'Ñ':
				sol=sol+'N';
				break;
			case 'ñ':
				sol=sol+'n';
				break;
			case 'ü':
				sol=sol+'u';
				break;
			case 'Ü':
				sol=sol+'U';
				break;

			default:
				sol=sol+t.charAt(i);
				break;
			}
		}
		System.out.println(sol);
	}

}
