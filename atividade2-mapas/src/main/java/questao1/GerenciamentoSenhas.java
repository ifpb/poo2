package questao1;

import java.util.TreeMap;

public class GerenciamentoSenhas {
	
	//Foi utilizado TreeMap porque ele mantém a ordem de inserção, o que é especialmente útil no caso de senhas
	protected TreeMap<String, ClienteAtendimento> senhas; //protected porque permite que seja utilizada por classes que a estendam (útil para a questao 3) 
	
	//Contador numérico de senhas, iniciando em 1
	private Long contador = 1l;
	
	//Tipo de senha (preferencial, normal ou qualquer outra denominação)
	private String tipo;
	
	public GerenciamentoSenhas(String tipo) { //O tipo deve ser informado na criação da classe GerenciamentoSenhas
		senhas = new TreeMap<String, ClienteAtendimento>();
		this.tipo = tipo;
	}
	
	/** 
	 * Cria uma nova senha para um determinado cliente
	 * @param clienteAtendimento - dados do cliente que deseja criar nova senha
	 * @return senha gerada
	 */
	public String gerarNovaSenha(ClienteAtendimento clienteAtendimento) {
		// Cria a senha como concatenando o tipo a um número sequencial
		String senha = tipo + "-" + String.format("%02d", contador++); //Método format utilizado pra adicionar um zero à esquerda
		senhas.put(senha, clienteAtendimento);
		return senha;
	}
	
	/**
	 * Retorna a próxima senha disponível e a remove do mapa.
	 * 
	 * @return próxima senha
	 */
	public String chamarProximo() {
		return senhas.pollFirstEntry().getKey();
	}
	
	/**
	 * Retorna o número de senhas restantes
	 * 
	 * @return número de senhas que ainda não foram chamadas
	 */
	public Integer senhasRestantes() {
		return senhas.entrySet().size();
	}
	

}
