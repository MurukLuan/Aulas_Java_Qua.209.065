package principal;

import java.util.Scanner;

public class NumeroParEIndice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[5];
				
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Entre com o numero: ");
			int numero = sc.nextInt();
			vetor[i] = numero;
		}
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print("Numero: " + vetor[i]);
				System.out.println(", Posição do vetor: " + i);
			}
		}
		
		sc.close();

	}

}
