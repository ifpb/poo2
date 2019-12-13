package br.edu.ifpb.poo2;
import java.util.ArrayList;
import java.util.List;

public class FraseInvertida {

	public static void main(String[] args) {
		
		List<String> frase = new ArrayList<String>();
		frase.add("POO 2");
		frase.add("é");
		frase.add("muito");
		frase.add("legal");
		
		System.out.println("Frase normal:");
		
		for(String palavra : frase) {
			System.out.println(palavra);
		}
		
		System.out.println("----------------");
		System.out.println("Frase invertida:");
		
		for(int i=frase.size()-1; i >= 0; i--) {
			System.out.println(frase.get(i));
		}
		
	}
	
}
