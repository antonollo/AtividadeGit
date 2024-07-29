package br.edu.uea.rh.model;

public class Caixa extends Funcionario{
	private String horario;

	public Caixa(double Salario) {
		super(Salario);
	}
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	public double getBonus() {
		return getSalarioFuncionario() * 1.2;
	}
	
}
