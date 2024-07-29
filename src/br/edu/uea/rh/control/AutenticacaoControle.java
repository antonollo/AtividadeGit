package br.edu.uea.rh.control;

import br.edu.uea.rh.model.*;

public class AutenticacaoControle {
	private int contador;
	
	public int getContador() {
		return contador;
	}
	public void efetuarLogin(Usuario usuario, int senha) {
		if (usuario.autenticar(senha)) {
			contador++;
		}
	}
}
