package entities;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String departamento, char sexo, int idade, double salario) {
		super(nome, departamento, sexo, idade, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bonificacao() {
		// TODO Auto-generated method stub
		this.salario += 500.00;
	}

}
