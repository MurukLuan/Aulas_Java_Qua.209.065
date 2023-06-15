package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa;
		List<Pessoa> pessoas = new ArrayList<>();
		char opcao;
		do {
			
			System.out.print("Entre com o nome: ");
			//pessoa.setNome(sc.nextLine());
			String nome = sc.nextLine();
			
			System.out.print("Entre com o telefone: ");
			//pessoa.setTelefone(sc.nextLine());
			String telefone = sc.nextLine();
			System.out.print("Entre com a idade: ");
			//pessoa.setIdade(sc.nextInt());
			int idade = sc.nextInt();
			
			pessoa = new Pessoa(nome, telefone, idade);
			
			pessoas.add(pessoa);
			System.out.print("Deseja cadastrar mais uma pessoa?");
			System.out.println("s/n");
			opcao = sc.next().charAt(0);
			sc.nextLine();
		}while(Character.toLowerCase(opcao) == 's');
		
		System.out.println("Pessoas cadastradas: ");
		for(Pessoa p : pessoas) {
			System.out.println(p +"\n");
		}
		
		sc.close();

	}

}
