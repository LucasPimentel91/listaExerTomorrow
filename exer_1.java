package lista_exercicios;

import java.util.Scanner;

public class exer_1 {
	
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = texto.nextInt();
		int resto = numero % 2;
		if (resto == 0) {
			System.out.println("Esse número é par");
		}else {
			System.out.println("Esse número é impar");
		}
		
		texto.close();
	}
	
}
