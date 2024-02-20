package algoritmos;

import utilidades.Entrada;

public class Ejercicio009 {

	public static void main(String[] args) {
		int n,sum,nnum;
		sum=0;
		nnum=1;
		
		do {
			if (nnum>0) {
				System.out.println("Introduzca el número de números de los que desee hacer la media:");
			} else {
				System.out.println("Error, el número debe ser superior a cero");
			}
			nnum=Entrada.entero();
		} while (nnum<=0);
		
		int [] arr= new int[nnum];

		for (int cont = 0; cont < nnum; cont++) {
			System.out.println("Introduzca Números:");
			n=Entrada.entero();
			sum=sum+n;
			arr[cont]=n;
					
		}
		
		System.out.println("La media de:");
		for (int i = 0; i < nnum; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		System.out.println("Es: "+sum/nnum);
	}

}
