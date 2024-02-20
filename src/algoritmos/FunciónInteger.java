package algoritmos;

public class FunciónInteger {

	public static void main(String[] args) {
		String t="88";		
		int n= Integer.valueOf(t);
		n=n+2;
		t=String.valueOf(n);
		
		System.out.println("Base 10: "+n);
		System.out.println("Base 2: "+Integer.toBinaryString(n));
		System.out.println("Base 8: "+Integer.toOctalString(n));
		System.out.println("Base 16: "+Integer.toHexString(n));

	}

}
