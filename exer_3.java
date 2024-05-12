package lista_exercicios;

public class exer_3 {

	public static void main(String[] args) {
		int n = 303;
		if(n < 10) {
			System.out.println("Somente um dígito!!! Envie um numero maior que 9");		
		}
		int cont=0, resto=0;
		do {
			int copy = n;
			if(copy%10==0) {
				cont++;
				copy/=10;
				resto = copy%10;
			}
		}while(resto == 0);
		int vetor[] = new int[cont];
		int divisor = 10;
		for(int i=0;i<cont;i++) {
			vetor[i]=n%divisor;
			n = n/divisor;
		}
		if(vetor[0]==vetor[cont-1]) {
			System.out.println("O primeiro e último dígito são iguais.");
		}

	}

}
