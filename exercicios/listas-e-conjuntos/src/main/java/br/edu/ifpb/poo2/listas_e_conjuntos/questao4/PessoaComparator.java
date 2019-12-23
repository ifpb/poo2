package br.edu.ifpb.poo2.listas_e_conjuntos.questao4;

import java.util.Comparator;

import br.edu.ifpb.poo2.listas_e_conjuntos.questao3.Pessoa;

public class PessoaComparator implements Comparator<Pessoa> {

	public int compare(Pessoa p1, Pessoa p2) {
		return p1.getNome().compareTo(p2.getNome());
	}

}
