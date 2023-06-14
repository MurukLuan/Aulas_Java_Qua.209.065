package entities;

public class Produto {
	
	private String descricao;
	private int quantidade;
	private double preco;

	
	public Produto(String descricao, int quantidade, double preco) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Produto( int quantidade, double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public double retornaTotalEmEstoque() {
		return quantidade * preco;
	}
	
	@Override
	public String toString() {
		
		return "Produto: " + descricao
				+"\nQuantidade: " + quantidade
				+"\nTotal em estoque: " + 
				String.format("%.2f",  retornaTotalEmEstoque());
	}
	

}
