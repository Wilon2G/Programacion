package algoritmos;

import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		int n,cntc,cntk,contador;
		Random r=new Random();
		boolean jackpot;
		contador=0;
		do {
			cntc=0;
			cntk=0;
			for (int i = 0; i < 20; i++) {
				n=r.nextInt(2);
				
				if (n==1) {
					cntc=cntc+1;
				} else {
					cntk=cntk+1;
				}
			}
			contador=contador+1;
			System.out.println(cntc+" Caras y "+cntk+" Cruz");
			jackpot=cntc==20||cntk==0;
		} while (!jackpot);
		System.out.println("Jackpot! Ha hecho "+contador+" sets de veinte tiradas");
		System.out.println("Eso son "+contador*20+" tiradas!");
	}

}
