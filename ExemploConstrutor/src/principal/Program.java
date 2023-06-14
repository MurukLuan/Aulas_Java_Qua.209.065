package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome: ");
		String nome = sc.nextLine();
		System.out.println("Entre com a idade: ");
		int idade = sc.nextInt();
		
		Pessoa pessoa = new Pessoa(nome, idade);
		pessoa.setNome(nome);
		System.out.println(pessoa);
		
		sc.close();
	}

}
