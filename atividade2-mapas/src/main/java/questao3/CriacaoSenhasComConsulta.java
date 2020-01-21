package questao3;

import questao2.CriacaoSenhas;

public class CriacaoSenhasComConsulta extends CriacaoSenhas {

	public CriacaoSenhasComConsulta() {
		this.senhasNormais = new GerenciamentoSenhasComConsulta("CX");
		this.senhasPreferenciais = new GerenciamentoSenhasComConsulta("PR");
	}
	
	public static void main(String[] args) {
		
		CriacaoSenhasComConsulta criacaoSenhas = new CriacaoSenhasComConsulta();
		criacaoSenhas.criarSenhas();
		
		System.out.println("Senhas normais");
		/* cast para (GerenciamentoComConsulta) é necessário para utilizar os métodos primeiraSenha() e ultimaSenha()
		   definidos na implementação CriacaoSenhasComConsulta
		*/
		System.out.println("Primeira: " + ((GerenciamentoSenhasComConsulta)criacaoSenhas.senhasNormais).primeiraSenha()); 
		System.out.println("Última: " + ((GerenciamentoSenhasComConsulta)criacaoSenhas.senhasNormais).ultimaSenha());
		
		System.out.println("Senhas preferenciais");
		System.out.println("Primeira: " + ((GerenciamentoSenhasComConsulta)criacaoSenhas.senhasPreferenciais).primeiraSenha());
		System.out.println("Última: " + ((GerenciamentoSenhasComConsulta)criacaoSenhas.senhasPreferenciais).ultimaSenha());
		
	}

	
}
