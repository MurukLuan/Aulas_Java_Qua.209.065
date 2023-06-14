package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor do dolar: ");
		double valorCotacao = sc.nextDouble();
		
		System.out.print("Entre com o valor a ser convertido: ");
		double valorAConverter = sc.nextDouble();
		
		converterDolar(valorCotacao, valorAConverter);
	}
	static void converterDolar(double cotacao, double valor) {
		 double valorConvertidoParaDolar = valor / cotacao;
		 double valorConvertidoParaReal = valor * cotacao;
		 System.out.printf("Valor convertido de real para dolar: %.2f", valorConvertidoParaDolar);
		 System.out.printf("\nValor convertido de dolar para Real: %.2f", valorConvertidoParaReal);
	}
}
