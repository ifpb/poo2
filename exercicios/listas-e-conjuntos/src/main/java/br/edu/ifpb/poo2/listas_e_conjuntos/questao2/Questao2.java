package br.edu.ifpb.poo2.listas_e_conjuntos.questao2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Questao2 {
	public static void main(String[] args) {

		List<Integer> vetor = new ArrayList<Integer>();
		vetor = Arrays.asList(2,5,3,9,2,4,3,8,5);
		
		Set<Integer> conjunto = new HashSet<Integer>();
		
		for(Integer valor: vetor) {
			conjunto.add(valor);
		}
		
		for(Integer valorConjunto: conjunto) {
			System.out.println(valorConjunto);
		}
		
	}
}
