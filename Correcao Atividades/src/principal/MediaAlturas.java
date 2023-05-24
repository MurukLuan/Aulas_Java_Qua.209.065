package principal;

import java.util.Scanner;

public class MediaAlturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double somaAltura = 0;
		double altura = 0;

		/*for(int contador = 1; contador <= 5; contador++) {
			System.out.print("Insira a altura: ");
			altura = sc.nextDouble();
			somaAltura += altura;
		}*/
		int contador = 0;
		while(contador < 5) {
			System.out.print("Insira a altura: ");
			contador++;
			altura = sc.nextDouble();
			System.out.println(contador);
			somaAltura += altura;			
		}
		System.out.println(contador);
		System.out.println("A media das alturas é: " + 
		(somaAltura / contador));
		
		sc.close();

	}

}
