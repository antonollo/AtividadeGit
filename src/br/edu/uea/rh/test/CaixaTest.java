package br.edu.uea.rh.test;

import br.edu.uea.rh.model.*;

public class CaixaTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente(1000);
		Gerente gerente = new Gerente(1000);
		Caixa caixa = new Caixa(1000);
		System.out.println(funcionario.getBonus());
		System.out.println(gerente.getBonus());
		System.out.println(caixa.getBonus());
		
		((Gerente) funcionario).getSenhaGerente();
	}
}
