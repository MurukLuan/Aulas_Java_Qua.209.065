package principal;

import java.util.Scanner;

import entities.CalculoTerreno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculoTerreno ct = new CalculoTerreno();
		System.out.print("Entre com a largura: ");
		double largura = sc.nextDouble();
		System.out.print("Entre com ao comprimento: ");
		double comprimento = sc.nextDouble();
		
		ct.areaTerreno(largura, comprimento);
		sc.close();

	}

}
