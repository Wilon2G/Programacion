package clases;

import java.util.ArrayList;
import java.util.List;

public class PruebasArrayList {
	
	public static void main(String[] args) {
		List<Circulo> al = new ArrayList<Circulo>();
		Circulo c1=new Circulo(4,4,8);
		
		Circulo c2=new Circulo(4,4,5);
		
		Circulo c3=new Circulo(4,4,8);
		
		System.out.println("c1 con c2: "+c1.equals(c2));
		System.out.println("c1 con c3: "+c1.equals(c3));
		System.out.println("c3 con c2: "+c3.equals(c2));

		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(new Circulo(8,8,8));
		al.add(0,new Circulo(7,7,7));
		System.out.println(al.size());
		
		System.out.println(al.size());
		
		
	}
}
