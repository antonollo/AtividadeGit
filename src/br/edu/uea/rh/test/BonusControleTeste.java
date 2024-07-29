package br.edu.uea.rh.test;

import br.edu.uea.rh.model.BonusControle;
import br.edu.uea.rh.model.Funcionario;
import br.edu.uea.rh.model.Gerente;

public class BonusControleTeste {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		BonusControle control = new BonusControle();
		gerente.setNomeFuncionario("Luna");
		gerente.setSalarioFuncionario(1000);
		System.out.println(gerente.getNomeFuncionario()+ " - " + gerente.getSalarioFuncionario() + " - Bônus: " + gerente.getBonus());
		control.addBonus(gerente);
		Funcionario funcionario = new Funcionario();
		funcionario.setNomeFuncionario("Anna");
		funcionario.setSalarioFuncionario(1000);
		System.out.println(funcionario.getNomeFuncionario()+ " - " + funcionario.getSalarioFuncionario() + " - Bônus: " + funcionario.getBonus());
		control.addBonus(funcionario);
		System.out.println(control.getTotal());
		Funcionario fg = new Gerente(); // O funcionário vai incluir os métodos da classe Gerente, no entanto, deve haver uma conversão, como expresso abaixo.
		((Gerente) fg).setSenhaGerente(1234); // Serve para usar os métodos da classe-filha na classe-mãe.
		fg.setSalarioFuncionario(1000);
		System.out.println(fg.getBonus());
	}
}
