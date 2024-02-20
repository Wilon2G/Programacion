package algoritmos;



public class ParImparFunciones {
	
	public static void main(String[] args) {
		int cnt=0;
		//int n;
		if (espar(cnt)) {
			//nada
		}
		for (int i = 1; i < 500000; i++) {
			if (esprimo(i)) {
				System.out.print(i+" ");
				cnt++;
			}
			if (cnt==10) {
				System.out.println("");
				cnt=0;
			}
		}
	}

	private static boolean esprimo(int n) {
		boolean primo;
		primo=true;
		for (int i = 2; i <= n-1&&primo; i++) {
			if (n%i==0) {
				primo=false;
			}
		}
		return primo;
	}
	
	private static boolean espar(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
