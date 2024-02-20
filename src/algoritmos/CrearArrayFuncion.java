package algoritmos;

public class CrearArrayFuncion {

	public static void main(String[] args) {
		int [] arr = crearArray(3,5);
		int[] arr2 = {3,4,-5};
		mostrarArray(arr);
		mostrarArray(arr2);
	
		
}
		
	

	private static void mostrarArray(int[] arr) {
		System.out.print("(");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println(")");
	}


	private static int[] crearArray(int n1, int n2) {
		int[] arr = {n1,n2};
		return arr;
	}
	
	
}
