package questao2;

import questao1.ClienteAtendimento;
import questao1.GerenciamentoSenhas;

public class CriacaoSenhas {
	
	protected GerenciamentoSenhas senhasNormais;
	protected GerenciamentoSenhas senhasPreferenciais;
	
	public CriacaoSenhas() {
		senhasNormais = new GerenciamentoSenhas("CX");
		senhasPreferenciais = new GerenciamentoSenhas("PR");
	}
	
	public void criarSenhas() {

		ClienteAtendimento cliente1 = new ClienteAtendimento("1234-5", "53212-2", "José da Silva");
		String senhaGerada = senhasNormais.gerarNovaSenha(cliente1);
		System.out.println("Senha gerada para cliente " + cliente1.getTitular() + ": " + senhaGerada);

		ClienteAtendimento cliente2 = new ClienteAtendimento("1214-5", "53412-2", "Maria Joaquina");
		senhaGerada = senhasNormais.gerarNovaSenha(cliente2);
		System.out.println("Senha gerada para cliente " + cliente2.getTitular() + ": " + senhaGerada);

		ClienteAtendimento cliente3 = new ClienteAtendimento("1434-5", "53242-2", "Francisco Barbosa");
		senhaGerada = senhasNormais.gerarNovaSenha(cliente3);
		System.out.println("Senha gerada para cliente " + cliente3.getTitular() + ": " + senhaGerada);

		ClienteAtendimento cliente4 = new ClienteAtendimento("1134-5", "53242-2", "Zefinha Pessoa");
		senhaGerada = senhasPreferenciais.gerarNovaSenha(cliente4);
		System.out.println("Senha gerada para cliente " + cliente4.getTitular() + ": " + senhaGerada);

		ClienteAtendimento cliente5 = new ClienteAtendimento("1114-5", "03242-2", "Ziraldo Costa");
		senhaGerada = senhasPreferenciais.gerarNovaSenha(cliente5);
		System.out.println("Senha gerada para cliente " + cliente5.getTitular() + ": " + senhaGerada);
		

		ClienteAtendimento cliente6 = new ClienteAtendimento("1034-5", "53242-8", "Tohiko Das Graças");
		senhaGerada = senhasNormais.gerarNovaSenha(cliente6);
		System.out.println("Senha gerada para cliente " + cliente6.getTitular() + ": " + senhaGerada);
		

		ClienteAtendimento cliente7 = new ClienteAtendimento("1134-5", "53242-2", "Zezinho Cardoso");
		senhaGerada = senhasNormais.gerarNovaSenha(cliente7);
		System.out.println("Senha gerada para cliente " + cliente7.getTitular() + ": " + senhaGerada);
		

		ClienteAtendimento cliente8 = new ClienteAtendimento("1114-5", "53942-2", "Amaral Larama");
		senhaGerada = senhasNormais.gerarNovaSenha(cliente8);
		System.out.println("Senha gerada para cliente " + cliente4.getTitular() + ": " + senhaGerada);
		

		ClienteAtendimento cliente9 = new ClienteAtendimento("1131-5", "53292-2", "Tiziu");
		senhaGerada = senhasPreferenciais.gerarNovaSenha(cliente9);
		System.out.println("Senha gerada para cliente " + cliente9.getTitular() + ": " + senhaGerada);
		
		ClienteAtendimento cliente10 = new ClienteAtendimento("1131-5", "53292-2", "Ninja Jiraya");
		senhaGerada = senhasNormais.gerarNovaSenha(cliente10);
		System.out.println("Senha gerada para cliente " + cliente10.getTitular() + ": " + senhaGerada);
	
	}
	
	public void chamarSenhas() {

		while (senhasPreferenciais.senhasRestantes() > 0) {
			System.out.println("Chamando próxima senha preferencial: " + senhasPreferenciais.chamarProximo());
		}

		while (senhasNormais.senhasRestantes() > 0) {
			System.out.println("Chamando próxima senha normal: " + senhasNormais.chamarProximo());
		}
	}

	public static void main(String[] args) {
		CriacaoSenhas criacaoSenhas = new CriacaoSenhas();
		criacaoSenhas.criarSenhas();
		criacaoSenhas.chamarSenhas();
	}

}
