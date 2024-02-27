package br.com.fiap;

public class TesteFolhaDePagamento {
	public static void main(String[] args) {
		
		FolhaDePagamento folhaPag = new FolhaDePagamento();	
		
		folhaPag.calcularSalarioLiquido(5000, 2, 10, 50);
	}
}
