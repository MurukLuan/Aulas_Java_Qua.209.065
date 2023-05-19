package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random random = new Random();
		
		int d1 = random.nextInt(6) +1;
		int d2 = random.nextInt(6) +1;
		int d3 = random.nextInt(6) +1;
		
		System.out.println("Dado 1: " + d1);
		System.out.println("Dado 2: " + d2);
		System.out.println("Dado 3: " + d3);
		
		int total = d1 + d2 + d3;
		
		System.out.println("Soma total dos dados é: " + total);
		
		if(d1 == d2 || d1 == d3 || d2 == d3) {
			if(d1 == d2 && d2 == d3) {
				System.out.println("Sortudo. Ganhou mais 6 pontos de bonus");
				total = total + 6;
				System.out.println(total);
			}
			else {
				System.out.println("Ganhou mais 2 pontos de bonus");
				total = total + 2;
				System.out.println(total);
			}
		}

		if(total >= 15) {
			System.out.println("Parabens, voccê ganhou!");
		}else {
			System.out.println("Infelizmente você perdeu!");
		}
	}

}
