package lista_exercicios;

public class exer_6 {
	
	public static int fatorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * fatorial(n-1);
	}

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			System.out.print(i + ": ");
			System.out.print(fatorial(i) + " | ");
		}
	}

}
