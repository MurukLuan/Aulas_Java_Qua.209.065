package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre ocm o nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Entre com o cargo: ");
		funcionario.cargo = sc.nextLine();
		System.out.print("Entre com o salario: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.println("Salario: ");
		funcionario.verificaComissao();
		sc.close();
	}

}
