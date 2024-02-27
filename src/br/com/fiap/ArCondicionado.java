package br.com.fiap;

public class ArCondicionado {
	// atributo 
	public int temperatura;
	public String modo;
	
	// metódos
	public void aumentarTemperatura() {
		temperatura++;
	}
	
	public void diminuirTemperatura() {
		temperatura--;
	}
	
	public void trocarModo(String modoUsuario) {
		// modos: Cool (Frio), Heat (Quente), Auto (Automático), Dry (Desumidificar), Fan (Ventilação)
		modo = modoUsuario;
	}
	
	public void mostrar() {
		System.out.println("Temperatura atual: " + temperatura + "ºC");
		System.out.println("Modo atual: " + modo);
	}
}
