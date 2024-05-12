package lista_exercicios;

public class exer_5 {

	public static void main(String[] args) {
		int n=120;
		for(int i=1;i<=n;i++) {
			if(i*(i+1)*(i+2)==n) {
				int y=i+1;
				int x=i+2;
				System.out.println(n + " é triangular pois é produto de " + i);
				System.out.print("x" + y);
				System.out.print("x" + x);
		}

	}
	}
}
