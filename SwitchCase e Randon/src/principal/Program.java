package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random randon = new Random();
		
		int opcao = randon.nextInt (8) + 1;
		
		System.out.println(opcao);
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("terça");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sábado");
			break;

		default:
			System.out.println("Não corresponde a um dia da semana");
			break;
		}
		
		/*if(opcao.equals("Sexta-feira")) {
			System.out.println("Sextou");
		}else {
			System.out.println("Não sextou");
		}*/

	}

}
