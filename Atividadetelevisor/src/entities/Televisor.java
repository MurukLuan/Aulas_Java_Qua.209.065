package entities;

public class Televisor {
	
	public int canal;
	public int volume;
	public boolean ligado;
	
	public void aumentarVolume() {
		if(volume >= 0 && volume <= 10) {
			volume +=1;
		}
	}
	
	public void diminuirVolume() {
		if(volume >= 0 && volume <= 10) {
			volume -=1;
		}
	}
	
	public void aumentarCanal() {
		if (canal == 0) canal = 1;
		if(canal >= 1 && canal <= 16) {
			canal += 1;
		}
	}
	public void diminuirCanal() {
		if (canal == 0) canal = 1;
		if(canal >= 1 && canal <= 16) {
			canal -= 1;
		}
	}
	public void ligarTelevisor() {
		ligado = true; 
		canal = 1;
	}
	public void desligarTelevisor() {
		ligado = false; 
	}
	
	public void mostrarStatus() {
		if(ligado == true) {
			System.out.println("canal: " + canal);
			System.out.println("Volume: " + volume);
			System.out.println("Status: ligado");
		}else {
			System.out.println("Televisor desligado!");
		}
	}

}
