package br.com.fiap.ScannerJOPTIONPane;

import javax.swing.JOptionPane;

public class TesteFolhaDePagamentoJOPTION {
	public static void main(String[] args) {
		FolhaDePagamento folhaPag;
		
		// Variáveis (NÃO SÃO DA CLASSE!!!!!!!!!!)
		double salarioBruto, descontoINSS, valorPlanoSaude, salarioLiquido;
		int numeroDeDependentes;
		
		String aux; // variável auxiliar
		
		try {
			
			folhaPag = new FolhaDePagamento(); // instanciando o objeto
			
			aux = JOptionPane.showInputDialog("Qual o valor do salário bruto?");
			salarioBruto = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Quantos são seus dependentes?");
			numeroDeDependentes = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Qual o desconto do INSS?");
			descontoINSS = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Qual o valor do plano de saúde?");
			valorPlanoSaude = Double.parseDouble(aux);
			
			// colocando os valores nos atributos atraves das variaveis locais
			folhaPag.salarioBruto = salarioBruto;
			folhaPag.numeroDeDependentes = numeroDeDependentes;
			folhaPag.descontoINSS = descontoINSS;
			folhaPag.valorPlanoDeSaude = valorPlanoSaude;
			
			salarioLiquido = folhaPag.calcularSalarioLiquido();
			
			JOptionPane.showMessageDialog(null, "O salário líquido é " + salarioLiquido);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto de número! Tente novamente!");
		}
		
		
	}
}
