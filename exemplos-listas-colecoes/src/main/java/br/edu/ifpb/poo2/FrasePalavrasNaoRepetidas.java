package br.edu.ifpb.poo2;
import java.util.HashSet;
import java.util.Set;

public class FrasePalavrasNaoRepetidas {

	public static void main(String[] args) {
		
		Set<String> frase = new HashSet<String>();
		frase.add("Essa");
		frase.add("disciplina");
		frase.add("é");
		frase.add("bem");
		frase.add("legal");
		frase.add("sabe");
		frase.add("é");
		frase.add("essa");
		frase.add("disciplina");
		
		System.out.println("Palavras não-repetidas: ");
		for(String palavra: frase) {
			System.out.println(palavra);
		}
		
		System.out.println("Total de palavras não-repetidas: "+frase.size());
		
	}
	
}
