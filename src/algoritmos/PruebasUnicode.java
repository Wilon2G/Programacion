package algoritmos;

public class PruebasUnicode {

	public static void main(String[] args) {
		char c=0;
		//for (int i = 0; i < 11000; i++) {
			//System.out.print(c+" ");
			//if (i%80==0) {
				//System.out.println("");
			//}
			//c=(char) (c+1);
		//}
		c=':';
		System.out.println(Integer.toHexString(c));
		String t= "A\u0160B";
		System.out.println(t);
	}

}
