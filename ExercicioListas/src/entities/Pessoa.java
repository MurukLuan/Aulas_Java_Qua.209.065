package entities;

public class Pessoa {
	private String nome;
	private String telefone;
	private int idade;
	
	/*public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	public Pessoa(String nome, String telefone, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: " + nome
				+"\nTelefone: " + telefone
				+"\nIdade: " + idade;
	}
	
}
