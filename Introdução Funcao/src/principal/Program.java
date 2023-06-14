package principal;

public class Program {

	public static void main(String[] args) {
		
		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());
		System.out.println(mensagem4(254));
		
		int meuNumero = 650;
		System.out.println(mensagem4(meuNumero));
		
		//System.out.println(exemploDoIgor(16.6));
		
	}
	
	static void mensagem() {
		System.out.println("Primeiro void");
	}
	
	static void mensagem2(double n) {
		System.out.println("O numero informado foi: " + n);
	}
	
	static String mensagem3() {
		return "Aqui é minha função de numero 3";
	}
	
	static String mensagem4(int x) {
		return "Numero informado: " + x;
	}
	
	/*static int exemploDoIgor(double y) {
		return (int)y;
	}*/

}
