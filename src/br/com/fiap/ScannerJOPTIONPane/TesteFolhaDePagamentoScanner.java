package br.com.fiap.ScannerJOPTIONPane;

import java.util.Scanner;

public class TesteFolhaDePagamentoScanner {
	public static void main(String[] args) {
		// Chamando as classes
		Scanner scan;
		
		FolhaDePagamento folhaPag;
		
		// Variáveis (NÃO SÃO DA CLASSE!!!!!!!!!!)
		double salarioBruto, descontoINSS, valorPlanoSaude, salarioLiquido;
		int numeroDeDependentes;
			
		try {
			
			folhaPag = new FolhaDePagamento(); // instanciando o objeto
			scan = new Scanner(System.in); // instanciando o objeto
			
			// Pedindo os valores pro usuário
			System.out.println("Qual o valor do salário bruto?");
			salarioBruto = scan.nextDouble();
			
			System.out.println("Quantos são seus dependentes?");
			numeroDeDependentes = scan.nextInt();
			
			System.out.println("Qual o desconto do INSS?");
			descontoINSS = scan.nextDouble();
			
			System.out.println("Qual o valor do plano de saúde?");
			valorPlanoSaude = scan.nextDouble();
			
			// colocando os valores nos atributos atraves das variaveis locais
			folhaPag.salarioBruto = salarioBruto;
			folhaPag.numeroDeDependentes = numeroDeDependentes;
			folhaPag.descontoINSS = descontoINSS;
			folhaPag.valorPlanoDeSaude = valorPlanoSaude;
			
			salarioLiquido = folhaPag.calcularSalarioLiquido();
			
			System.out.println("Seu salário líquido é de: " + salarioLiquido);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto de número! Tente novamente!");
		}
		
	}
}
