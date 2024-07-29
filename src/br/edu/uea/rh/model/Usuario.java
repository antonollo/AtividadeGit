package br.edu.uea.rh.model;

public abstract class Usuario extends Funcionario{
	private int senha;

	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public abstract boolean autenticar(int senha);
	
}
