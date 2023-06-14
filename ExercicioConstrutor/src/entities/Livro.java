package entities;

public class Livro {
	/** Oordem sugerida a seguir na classe:
	 * 1º atributos da classe
	 * 2º construtores
	 * 3º metodos get e set
	 * 4º demais metodos
	 */
	private  String nome;
	private String edicao;
	private double valor;
	
	public Livro(String nome, String edicao, double valor) {
		super();
		this.nome = nome;
		this.edicao = edicao;
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor > 100) {
			this.valor +=  (valor * 0.3);
		}else {
			this.valor = valor;	
		}
		
	}
	
	@Override
	public String toString() {
		return "nome do livro: " + nome
				+"\nEdição: " + edicao
				+"\nValor: " + valor;
	}
	
	
	

}
