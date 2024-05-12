package lista_exercicios;

public class exer_4 {

	public static void main(String[] args) {
		int n=6;
		int i=2;
		int j=3;
		int cont=0, num=0;
		do {
			if(num%i == 0 && num%j == 0) {
				System.out.print(num);
				cont++;	
			}else if(num%i == 0) {
				System.out.print(num);
				cont++;
			}else if(num%j == 0){
				System.out.print(num);
				cont++;
			}
			num++;
		}while(cont!=n);

	}

}
