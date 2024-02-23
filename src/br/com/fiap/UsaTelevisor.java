package br.com.fiap;

public class UsaTelevisor {

	public static void main(String[] args) {
		
		Televisor televisor2 = new Televisor();
		
		televisor2.canal = 5;
		televisor2.volume = 30;
		
		televisor2.mostrar();
		System.out.println("------------------------------------------");
		televisor2.aumentarVolume();
		televisor2.aumentarVolume();
		televisor2.aumentarVolume();
		televisor2.aumentarVolume();
		televisor2.mostrar();
		System.out.println("------------------------------------------");
		televisor2.trocarCanal(9);
		televisor2.diminuirVolume();
		televisor2.diminuirVolume();
		televisor2.mostrar();
	}

}
