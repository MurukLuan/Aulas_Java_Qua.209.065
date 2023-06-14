package entities;

public class Triangulo {
	public String tipoTriangulo;
	
	public String retornaTipoTriangulo(int x, int y, int z) {
		if(x == y && y == z) {
			tipoTriangulo = "Triangulo equilatero";
			return tipoTriangulo;
		}else if(x == y || x == z || y == z) {
			tipoTriangulo = " Triangulo isósceles";
			return tipoTriangulo;
		}else {
			tipoTriangulo = "Triangulo escaleno";
			return tipoTriangulo;
		}
		
	}

}
