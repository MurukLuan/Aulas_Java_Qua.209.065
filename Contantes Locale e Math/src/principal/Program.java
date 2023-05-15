package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uma constante é quando seu valor não muda
		final double PI = 3.1415;
		int valor1 = 50;
		int valor2 = 65;
		
		//realiza a potencia
		System.out.println(Math.pow(2 , 2));
		
		//passagem de 2 numeros como parametro
		//retorna o maior deles
		System.out.println(Math.max(valor2 , valor1));
		
		//é o inverso do max, pega o minimo
		System.out.println(Math.min(5, 20));
		
		//retorna a raiz quadrada de um numero
		System.out.println(Math.sqrt(18));
		
		//arredonda o número (para mais ou para menos)
		System.out.println(Math.round(25.4578));
		
		//podemos realizar calculos com valores
		//retornados pelo calculo de Math.
		System.out.println(2 + Math.sqrt(18));
		
		Scanner leia = new Scanner(System.in);
		Locale ponto = new Locale("en", "us");
		
		//System.out.println("Entre com o valor do dolar: ");
		//double dolar = leia.useLocale(ponto).nextDouble();
		
		//System.out.println("Valor dolar digitado: " +  dolar);
		
		String nome = "Luan Muruk";
		char sexo = 'M';
		int idade = 32;
		double altura = 1.833338414;
		
		System.out.printf("O meu nome é %s, sou do sexo %c"
				+ ", tenho %d anos, minha altura é: %.2f"
				+ "", nome, sexo, idade, altura);
		
		/*
		 * operadores de comparação
		 * > maior que
		 * < menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * != diferente de
		 * == igual a
		 */
		
		/*
		 * operadores lógicos
		 * && = e
		 * || = ou
		 * ! = negação
		 */
		
		leia.close();
		
	}

}
