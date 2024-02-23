package br.com.fiap;

public class UsaRadio {
	public static void main(String[] args) {
		
		Radio radio2 = new Radio();
		
		radio2.volume = 5;
		radio2.estacao = 89.1f;
		
		radio2.mostrar();
		System.out.println("------------------------------------------");
		radio2.aumentarVolume();
		radio2.mostrar();
		System.out.println("------------------------------------------");
		radio2.trocarEstacao(92.5f);
		radio2.aumentarVolume();
		radio2.aumentarVolume();
		radio2.aumentarVolume();
		radio2.aumentarVolume();
		radio2.mostrar();
		
	}
}
