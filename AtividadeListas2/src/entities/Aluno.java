package entities;

public class Aluno {
	private String nomeAluno;
	private int serie;
	private double media;
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public double getMedia() {
		return media;
	}	
	
	public void notas(double n1, double n2, double n3, double n4) {
		this.media = (n1 + n2 + n3 + n4) / 4;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nomeAluno
				+"\nSerie: " + serie
				+"\nMedia: " + media;
	}

}
