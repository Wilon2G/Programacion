package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utilidades.Entrada;

public class AlPedirNumeros {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		int[] n= {1,4,2,6,88,32};
		boolean fin = false;
		do {
			System.out.println("Introduzca Número:");
			String t = Entrada.cadena();

			if (t.equals("")) {
				fin = true;
			} else {
				al.add(Integer.valueOf(t));
			}

		} while (!fin);
		List<Integer> pares = extraerPares(al);
		List<Integer> imPares = extraerImpares(al);
		mostrarLista(al);
		
		List<Integer> nums= arrayALista(n);
		mostrarLista(nums);
		
		int[] arnums = ListaAArray(nums);
		mostrarArray(arnums);
		
	}

	private static void mostrarArray(int[] arnums) {
		System.out.print("[ ");
		for (int i = 0; i < arnums.length; i++) {
			System.out.print(arnums[i]+" ");
		}
		System.out.print
		("]");
	}

	private static int[] ListaAArray(List<Integer> nums) {
		int[] sol=new int[nums.size()];
		for (int i = 0; i < sol.length; i++) {
			sol[i]=nums.get(i);
		}
		
		return sol;
	}

	private static List<Integer> arrayALista(int[] n) {
		List<Integer> sol = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			sol.add(n[i]);
		}
		
		
		return sol;
	}

	private static void multiplicarListaPor(int n, List<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			l.set(i, l.get(i)*n);
		}
	}

	private static List<Integer> extraerImpares(List<Integer> al) {
		List<Integer> impares = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 != 0) {
				impares.add(al.get(i));
			}

		}

		return impares;
	}

	private static void mostrarLista(List<Integer> pares) {
		System.out.print("[");
		for (int i = 0; i < pares.size(); i++) {
			System.out.print(pares.get(i));
			if (i < pares.size() - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}

	private static List<Integer> extraerPares(List<Integer> al) {
		List<Integer> pares = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				pares.add(al.get(i));
			}
		}

		return pares;
	}

}
