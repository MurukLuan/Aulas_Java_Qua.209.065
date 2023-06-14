package principal;

import java.util.Scanner;

public class Argumentos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os 3 numeros a serem somados");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		somarNumeros(n1, n2, n3);
		
		sc.close();
	}
	static void somarNumeros(int n1, int n2, int n3) {
		System.out.print("A soma dos numeros é: ");
		System.out.println(n1 + n2 + n3);
	}

}
