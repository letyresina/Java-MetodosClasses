package br.com.fiap;

public class UsaArCondicionado {
	public static void main(String[] args) {
		
		ArCondicionado arcondicionado2 = new ArCondicionado();
		
		arcondicionado2.temperatura = 20;
		arcondicionado2.modo = "Fan";
		
		arcondicionado2.mostrar();
		
		System.out.println("------------------------------------------");
		
		arcondicionado2.diminuirTemperatura();
		arcondicionado2.diminuirTemperatura();
		arcondicionado2.diminuirTemperatura();
		arcondicionado2.diminuirTemperatura();
		arcondicionado2.diminuirTemperatura();
		
		arcondicionado2.modo = "Cool";
		
		arcondicionado2.mostrar();
	}
}
