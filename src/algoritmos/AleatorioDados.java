package algoritmos;
import java.util.Random;
public class AleatorioDados {

	public static void main(String[] args) {
        boolean[] oppdado = new boolean[6];
        int caras = 0;
        int total = 0;
        int roll=0;
        Random random = new Random();

        while (caras < oppdado.length) {
            roll = random.nextInt(6);
            System.out.print(roll+1+" ");
            if (!oppdado[roll]) {
                oppdado[roll] = true;
                caras++;
            }

            total++;
        }
        System.out.println("");
        System.out.println("Hemos necesitado " + total + " tiradas para conseguir las seis caras");
	}

}

