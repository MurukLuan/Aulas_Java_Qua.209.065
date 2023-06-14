package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		/*adiciona dados na lista*/
		nomes.add("Luan");
		nomes.add("Maria");
		nomes.add("Grogu");
		nomes.add("Reri poti");
		//mostra os dados da lista
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		//remove os dados da lista
		//nomes.remove(2);
		for(String nome : nomes) {
			System.out.println("nome: " + nome);
		}
		//obtem o dado da lista por indice (posição na memoria)
		System.out.println(nomes.get(3));
		
		String dado = nomes.stream().filter(x -> x == "Luans")
				.findFirst().orElse(null);
		
		Collections.sort(nomes);
		System.out.println("Imprimindo em ordem alfabetica");
		for(String nome : nomes) {
			System.out.println("Nome1: " + nome);
		}
		
		System.out.println(dado);
	}

}
