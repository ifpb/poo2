package questao3;

import questao1.GerenciamentoSenhas;

public class GerenciamentoSenhasComConsulta extends GerenciamentoSenhas {

	public GerenciamentoSenhasComConsulta(String tipo) {
		super(tipo);
	}

	public String primeiraSenha() {
		return this.senhas.firstKey();
	}
	
	public String ultimaSenha() {
		return this.senhas.lastKey();
	}
	
}
