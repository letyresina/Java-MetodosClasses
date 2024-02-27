package br.com.fiap.carro;

import java.util.Scanner;

public class Carro {
	
	Scanner scan;
	
	// atributos
	public String marca;
	public String cor;
	public String tipo;
	public String modelo;
	public int anoFabricado;
	
	// metódos 
	public void ligarCarro() {
		System.out.println("Carro ligado.");
	}
	
	public void desligarCarro() {
		System.out.println("Carro desligado.");
	}
	
	public void cadastrarCarro() {
		scan = new Scanner(System.in);
		
		System.out.println("Qual a marca do carro?");
		marca = scan.next();
		
		System.out.println("Qual a cor do carro?");
		cor = scan.next();
		
		System.out.println("Qual o tipo de utilização do carro?");
		tipo = scan.next();
		
		System.out.println("Qual o modelo do carro?");
		modelo = scan.next();
		
		System.out.println("Qual ano de fabricação do carro?");
		anoFabricado = scan.nextInt();
	}
	
	public void mostrar() {
		System.out.println("Carro cadastrado atualmente");
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Tipo de utilização: " + tipo);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + anoFabricado);
	}
}
