package lista_exercicios;

import java.util.Scanner;

public class exer_2 {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = texto.nextInt();
		int cont=0, resto=0;
		do {
			int copy = numero;
			if(copy%10==0) {
				cont++;
				copy/=10;
				resto = copy%10;
			}
		}while(resto == 0);
		int vetor[] = new int[cont];
		int divisor = 10;
		for(int i=0;i<cont;i++) {
			vetor[i]=numero%divisor;
			numero = numero/divisor;
		}
		int cont2=0;
		for(int a=0;a<cont-1;a++) {
			if(vetor[a]==vetor[a+1]) {
				cont2++;
				if(cont2==2) {
					System.out.println("Há dois dígitos consecutivos iguais nesse numero.");
					break;
					
				
				}
			}
		}
		if(cont2!=2) {
			System.out.println("Não há dois dígitos consecutivos no número");
		}
		texto.close();
	}

}
