package br.edu.uea.rh.test;

import br.edu.uea.rh.model.*;

public class GerenteTest {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNomeFuncionario("Luna");
		gerente.setSalarioFuncionario(1000);
		System.out.println(gerente.getNomeFuncionario()+ " - " + gerente.getSalarioFuncionario() + " - Bônus: " + gerente.getBonus());
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeFuncionario("Anna");
		funcionario.setSalarioFuncionario(1000);
		System.out.println(funcionario.getNomeFuncionario()+ " - " + funcionario.getSalarioFuncionario() + " - Bônus: " + funcionario.getBonus());
	}
}
