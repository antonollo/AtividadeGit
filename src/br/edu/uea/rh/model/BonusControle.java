package br.edu.uea.rh.model;

public class BonusControle {
	public static double total;
	
	public void addBonus (Funcionario funcionario) {
		total += funcionario.getBonus();
	}
	public double getTotal() {
		return total;
	}
}
