package algoritmos;

public class Ejemplo {
	public static void main(String[] args) {
		int[] numeros = { 0, 0, 2, 0, 0, 0 };
		boolean haynum=false;
		for (int i = 0; i < numeros.length && !haynum; i++) {
			if (numeros[i] != 0) {
				haynum = true;
			}
		}
		if (haynum) {
			System.out.println("El array NO está vacío");
		} else {
			System.out.println("El array SI está vacío");
		}
	}
}
