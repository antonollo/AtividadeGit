package br.edu.uea.rh.model;

public class Diretor extends Usuario {
	
	public Diretor(double salario) {
		setSalarioFuncionario(salario);
	}
	public Diretor(int senha) {
		setSenha(senha);
	}
	public double getBonus() {
		return getSalarioFuncionario() * 10;
	}
	public boolean autenticar(int senha) {
		return this.getSenha() == senha;
	}
}
