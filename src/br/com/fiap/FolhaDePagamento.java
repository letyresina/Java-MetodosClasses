package br.com.fiap;

import java.util.Scanner;

public class FolhaDePagamento {
	
	Scanner scan;
	
	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;
	
	public double calcularSalarioLiquido() {
		scan = new Scanner(System.in);
		
		System.out.println("Qual seu salário bruto?");
		salarioBruto = scan.nextDouble();
		
		System.out.println("Quantos são seus dependentes?");
		numeroDeDependentes = scan.nextInt();
		
		System.out.println("Qual seu desconto do INSS?");
		descontoINSS = scan.nextInt();
		
		System.out.println("Qual o valor do seu plano de saúde?");
		valorPlanoDeSaude = scan.nextDouble();
		
		// descobrindo o valor de soma do desconto do INSS
		double descontoTotalINSS = salarioBruto * (descontoINSS / 100);
		System.out.println(descontoTotalINSS);
		
		// quantidade de pessoas que usam o plano
		int pessoasPlano = 1 + numeroDeDependentes;
		
		// descobrindo de fato o valor d plano
		double valorPlanoTotal = valorPlanoDeSaude * pessoasPlano;
		System.out.println(valorPlanoTotal);
		
		double descontosTotais = descontoTotalINSS + valorPlanoTotal;
		System.out.println(descontosTotais);
				
		double calculoSalario = salarioBruto - descontosTotais;
		System.out.println(calculoSalario);
		
		double salarioLiquido = calculoSalario;
		
		System.out.println("O salário líquido é: " + salarioLiquido);
		
		return salarioLiquido;
	}
}
