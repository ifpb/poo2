package br.edu.ifpb.poo2.listas_e_conjuntos.questao1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao1 {
	public static void main(String[] args) {
		
//		int[] vetor = new int[] { 2, 5, 3, 9, 2, 4, 3, 8, 5 };
//		for (int i = 0; i <= 12; i++) {
//			System.out.println(vetor[i]);
//		}

		List<Integer> vetor = new ArrayList<Integer>();
//		vetor.add(2);
//		vetor.add(5);
//		vetor.add(3);
//		vetor.add(9);
//		vetor.add(2);
//		vetor.add(4);
//		vetor.add(3);
//		vetor.add(8);
//		vetor.add(5);
//		
		vetor = Arrays.asList(2,5,3,9,2,4,3,8,5);
		
		for(Integer valor: vetor) {
			System.out.println(valor);
		}
		
	}
}
