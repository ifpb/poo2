package br.edu.ifpb.poo2.exemplos_mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class OcorrenciasPalavras {
	public static void main(String[] args) {

		String frase = "POO 2 é uma disciplina muito boa. Nesta disciplina é possível aprender vários conceitos avançados de POO";
		
		Map<String, Integer> palavras = new HashMap<String, Integer>();
		for(String palavra: frase.split(" ")) { 
			palavras.put(palavra, Optional.ofNullable(palavras.get(palavra)).orElse(0) + 1);	
		}
		
		for(Map.Entry<String, Integer> linha : palavras.entrySet()) {
			System.out.println("Palavra = " + linha.getKey());
			System.out.println("Ocorrências= " + linha.getValue());
		}
		
	}
}
