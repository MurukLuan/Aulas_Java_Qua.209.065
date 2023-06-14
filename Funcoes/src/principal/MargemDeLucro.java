package principal;

import java.util.Scanner;

public class MargemDeLucro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor do produto: ");
		double valorProduto = sc.nextDouble();
		System.out.print("Entre com a porcentagem a ser aplicada: ");
		double porcentagem = sc.nextDouble();
		
		retornaValorVenda(valorProduto, porcentagem);
		sc.close();
	}
	static void retornaValorVenda(double valorProduto, double porcentagem) {
		double valorVenda = valorProduto + 
				(valorProduto * (porcentagem / 100));
		System.out.println("Valor de venda: " + valorVenda);
	}

}
