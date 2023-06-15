package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno;
		List<Aluno> alunos = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			aluno = new Aluno();
			System.out.print("Entre com o nome do Aluno: ");
			aluno.setNomeAluno(sc.nextLine());
			
			System.out.print("Entre com a serie do Aluno: ");
			aluno.setSerie(sc.nextInt());
			
			//aqui poderia (ficaria melhor de entender) usar o pedido de notas 4 vezes
			//e depois atribuir as notas no metodo de notas
			System.out.println("Entre com as 4 notas do Aluno: ");
			aluno.notas(sc.nextDouble(), 
					sc.nextDouble(),
					sc.nextDouble(),
					sc.nextDouble());
			alunos.add(aluno);
			sc.nextLine();
		}
		
		System.out.println("Alunos e suas medias: ");
		
		for(Aluno a : alunos) {
			System.out.println(a);
			System.out.println();
		}
		
		sc.close();

	}

}
