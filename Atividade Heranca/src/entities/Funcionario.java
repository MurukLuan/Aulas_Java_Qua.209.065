package entities;

public class Funcionario {
	private String nome;
	private String departamento;
	private char sexo;
	private int idade;
	protected double salario;
	
	public Funcionario(String nome, String departamento, char sexo, int idade, double salario) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.sexo = sexo;
		this.idade = idade;
		this.salario = salario;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void bonificacao() {
		this.salario += 150.00;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome
				+ "\nIdade: " + idade
				+"\nsexo: " + sexo
				+"\nDepartamento: " + departamento
				+"\nSalario: " + getSalario();
	}

}
