package ejerciciosListas;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random r=new Random();
		List<Integer> al = new ArrayList<Integer>();
		int n =r.nextInt(10,20);
		int suma=0;
		
		for (int i = 0; i < n; i++) {
			al.add(r.nextInt(0,100));
		}
		for (int i = 0; i < al.size(); i++) {
			suma=suma + al.get(i);
		}
		int max=0;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i)>max) {
				max=al.get(i);
			}
		}
		int min=100;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i)<min) {
				min=al.get(i);
			}
		}
		
		System.out.println(suma);
		System.out.println(al.stream().mapToInt(Integer::intValue).sum());
		System.out.println(suma/al.size());
		System.out.println(al.stream().mapToInt(Integer::intValue).average());
		System.out.println(max);
		System.out.println(al.stream().mapToInt(Integer::intValue).max());
		System.out.println(min);
		System.out.println(al.stream().mapToInt(Integer::intValue).min());
	}

}
