package br.com.fiap;

public class Televisor {
	// atributos
	public int volume;
	public int canal;
	
	// metódos
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void trocarCanal(int canalUsuario) {
		canal = canalUsuario;
	}
	
	public void mostrar() {
		System.out.println("Volume atual: " + volume);
		System.out.println("Canal atual: " + canal);
	}
}
