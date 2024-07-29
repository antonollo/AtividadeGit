package br.edu.uea.rh.test;

import br.edu.uea.rh.model.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeFuncionario("Anna");
		funcionario.setSalarioFuncionario(1000);
		System.out.println(funcionario.getNomeFuncionario()+ " - " + funcionario.getSalarioFuncionario() + " - Bônus: " + funcionario.getBonus());
	}
}
