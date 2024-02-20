package algoritmos;

public class Pruebass {

	public static void main(String[] args) {
		int[]z= {1};
		z= nuevo(z);
		System.out.println(z.length);
	}
	static int[] nuevo(int[]z) {
		int m=z.length+1;
		int[]mas=new int[m];
		return mas;
	}
}
