package algoritmos;

import java.util.Random;

public class AleatorioNombres {

	public static void main(String[] args) {
		String [] nombres= {"Juan","Anna","Pepe","Julia","Guillermo","Pedro","Ivan","Carlos","Jose","Carlota"};
		int n;
		boolean repe;
		for (int i = 0; i < 5; i++) {
			do {
				Random r=new Random();
				n=r.nextInt(nombres.length);
				repe=nombres[n].equals("");
			} while (repe);
			System.out.println(nombres[n]);
			nombres[n]="";
		}

	}

}
