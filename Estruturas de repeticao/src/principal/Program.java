package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//usado quando sabemos a quantidade de vezes 
		//que irá repetir
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("/**************/");
		int i = 0;
		//usado quando não sabemos a quantidade 
		//de vezes que iremos repetir
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja continuar? ");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while(Character.toUpperCase(opcao) == 'S') {
			j++;
			System.out.print("Deseja continuar? ");
			opcao = sc.next().charAt(0);
		}
		System.out.println("Entrou no while: " + j);
		
		//do while, garante que sera executado o bloco
		//de codigos ao menos 1 vez
		int k = 0;
		do {
			System.out.print("Deseja continuar? ");
			opcao = sc.next().charAt(0);
			k++;
		}while(Character.toUpperCase(opcao) == 'S');
		System.out.println("Entrou no do while: " + k);
		
		sc.close();

	}

}
