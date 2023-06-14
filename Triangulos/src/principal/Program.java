package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.print("Entre com o valor x: ");
		int x = sc.nextInt();
		System.out.print("Entre com o valor y: ");
		int y = sc.nextInt();
		System.out.print("Entre com o valor z: ");
		int z = sc.nextInt();
		
		triangulo.retornaTipoTriangulo(x, y, z);
		System.out.println(triangulo.tipoTriangulo);
		
		sc.close();

	}

}
