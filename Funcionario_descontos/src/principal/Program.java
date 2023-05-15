package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		double salarioBruto;
		double inss;
		double ir;
		double salarioLiquido;

		System.out.print("Entre com seu salario bruto: ");
		salarioBruto = leia.nextDouble();

		inss = salarioBruto * 0.05;
		ir = salarioBruto * 0.11;
		salarioLiquido = salarioBruto - inss - ir;

		System.out.println("Desconto inss: " + inss);
		System.out.println("Desconto IR: " + ir);
		System.out.println("Salario liquido: R$ " + salarioLiquido);
		leia.close();

	}

}
