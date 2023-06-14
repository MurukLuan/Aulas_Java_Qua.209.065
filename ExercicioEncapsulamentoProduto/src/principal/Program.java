package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		//Produto produto = new Produto();
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(produto);
		
		System.out.println("Entre com o nome do produto: ");
		String nome = sc.nextLine();
		//produto.setDescricao(sc.nextLine());
		
		System.out.println("Entre com a quantidade a ser adicionada: ");
		int qtd = sc.nextInt();
		//produto.adicionaProduto(sc.nextInt());
		
		System.out.println("Entre com o valor unitario: ");
		double valor = sc.nextDouble();
		//produto.setPreco(sc.nextDouble());
		
		Produto produto = new Produto(nome, qtd, valor);
		
		System.out.println(produto);
		
		System.out.println("Quantidade a ser removida: ");
		produto.removeProduto(sc.nextInt());
		
		System.out.println(produto);
		sc.close();

	}

}
