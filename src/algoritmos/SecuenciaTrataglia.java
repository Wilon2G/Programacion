package algoritmos;

import utilidades.Entrada;

public class SecuenciaTrataglia {

	public static void main(String[] args) {
		int [] fila= {1};
		int altura;
		altura=Entrada.entero();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < fila.length; j++) {
				System.out.print(fila[j]);
			}
			System.out.println("");
			fila=siguientefila(fila);
		}
		
	
		
		
	}

	private static int[] siguientefila(int[] fila) {
		int[]sig=new int[fila.length+1];
		sig[0]=1;
		sig[sig.length-1]=1;
		for (int i = 1; i < sig.length-1; i++) {
			sig[i]=fila[i-1]+fila[i];
		}
		return sig;
	}
	
	
	
	
	
	

	
	
	
}






















