package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Nome: ");
		pessoa.nome = sc.nextLine();
		System.out.print("Ano do nascimento: ");
		int ano = sc.nextInt();
		//pessoa.retornaIdade(sc.nextInt());
		System.out.print("Sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		pessoa.retornaIdade(ano);
		
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
		System.out.println("Sexo: " + pessoa.sexo);
		sc.close();

	}

}
