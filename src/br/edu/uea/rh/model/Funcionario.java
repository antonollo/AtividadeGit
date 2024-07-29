package br.edu.uea.rh.model;

// Classe Abstrata = Classe que serve apenas de base para outras (ex: Classe Funcionário), pode ter métodos abstratos e concretos. 
// (neste ex: Classe Funcionario)
// Classe Concretea = Classe que é trabalhada de fato, surgida de classes abstratas, deve ter somente métodos concretos ou 
// métodos surgidos de métodos abstratos. (neste ex: Classe Caixa e Gerente)
// Método Abstrato = Método que existe na classe-pai (ou em outras classes também) que obriga as suas classes-filhas
// também a ter estes métodos. 

public abstract class Funcionario {
	// O comando abstract serve para transformar esta superclasse em uma classe-modelo para criação de outras classes.
	// Não se pode mais instanciar e criar classes do tipo Funcionário, já que é abstrata. Entenda: Não faz mais sentido
	// instanciar classes funcionário, mas pode trabalhar ela através do Polimorfismo (a partir da classe-mãe, se pode instanciar classes filhas)
	// uma vez que a lógica é que se trabalha com gerente, caixas e inúmeros outros tipos de funcionário, mas não o funcionário propriamente dito.
	
	private String nomeFuncionario;
	private String emailFuncionario;
	private double salarioFuncionario;
	
	public Funcionario() {
	}
	
	public Funcionario(double Salario) {
		System.out.println("CONSTRUTOR COM SALÁRIO ATIVADO");
		this.salarioFuncionario = Salario; 
		// Quando se cria um construtor para uma classe que tem herança, deve haver um construtor para todas as classes
		// com herança também, chamando para o construtor principal (agora chamado de superconstrutor. Verifique as classes 
		// Gerente e Caixa para entender! 
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getEmailFuncionario() {
		return emailFuncionario;
	}
	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}
	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	public abstract double getBonus(); // Quando se cria um método abstrato, não se trata mais como função propriamente dita. 
	
	public void efetuarLogin(Funcionario funcionario, )
}
