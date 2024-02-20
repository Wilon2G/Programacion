package algoritmos;



import utilidades.Entrada;

public class OppString {

	public static void main(String[] args) {
		String t="La casa es grande";
		System.out.println("Introduzca un texto:");
		t=Entrada.cadena();
		System.out.println(t);
		System.out.println("Ese texto tiene "+t.length()+" Caracteres");
		if (t.equalsIgnoreCase("hola")) {
			System.out.println("Hola :)");
		}
		else {
			System.out.println("No me has dicho hola :(");
		}
		System.out.println("Tu texto en minúsculas es: "+t.toLowerCase());
		System.out.println(String.valueOf(12));
		String[]texts= t.split("[ ,.]+");
		for (int i = 0; i < texts.length; i++) {
			System.out.println(texts[i]);
		}
		System.out.println(leftmost(t,5));
		System.out.println(rightmost(t,5));
		
		for (int i = 0; i < t.length(); i++) {
			System.out.print(t.charAt(i)+" ");
		}
	}

	private static String rightmost(String t,int n) {
		if (n>t.length()) {
			return t;
		}
		else {
			return t.substring(t.length()-n,t.length());
		}

	}

	private static String leftmost(String t, int n) {
		if (n>t.length()) {
			return t;
		}
		else {
			return t.substring(0,n);
		}

	}
}
