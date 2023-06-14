package entities;

public class CalculoTerreno {
	
	public double areaTotal;
	
	public void areaTerreno(double largura, double comprimento) {
		areaTotal = largura * comprimento;
		System.out.println("A area total é: " + areaTotal);
	}

}
