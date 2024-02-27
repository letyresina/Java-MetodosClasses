package br.com.fiap;

public class FolhaDePagamento {
	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;
	
	public double calcularSalarioLiquido(double salarioBrutoUsuario, int numeroDeDependentesUsuario, double descontoINSSUsuario, double valorPlanoDeSaudeUsuario) {
		
		salarioBruto = salarioBrutoUsuario;
		numeroDeDependentes = numeroDeDependentesUsuario;
		descontoINSS = descontoINSSUsuario;
		valorPlanoDeSaude = valorPlanoDeSaudeUsuario;
		
		// descobrindo o valor de soma do desconto do INSS
		double descontoTotalINSS = salarioBruto * (descontoINSS / 100);
		
		// quantidade de pessoas que usam o plano
		int pessoasPlano = 1 + numeroDeDependentes;
		
		// descobrindo de fato o valor d plano
		double valorPlanoTotal = valorPlanoDeSaude * pessoasPlano;
		
		double descontosTotais = descontoTotalINSS + valorPlanoTotal;
		
		double calculoSalario = salarioBruto - descontosTotais;
		
		double salarioLiquido = calculoSalario;
		
		System.out.println("O salário líquido é: " + salarioLiquido);
		
		return salarioLiquido;
	}
}
