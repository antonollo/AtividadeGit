package br.edu.uea.rh.model;

public class Gerente extends Usuario{
	
	public Gerente(double salario) {
		setSalarioFuncionario(salario);
	}
	public Gerente (int senha) {
		setSenha(senha);
	}
	public double getBonus() {
		return getSalarioFuncionario() * 1.5;
	}
	public boolean autenticar(int senha) {
		return this.getSenha() == senha;
	}
}
