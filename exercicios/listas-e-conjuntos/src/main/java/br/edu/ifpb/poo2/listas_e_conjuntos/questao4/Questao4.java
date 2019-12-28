package br.edu.ifpb.poo2.listas_e_conjuntos.questao4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.edu.ifpb.poo2.listas_e_conjuntos.questao3.Pessoa;

public class Questao4 {
	
	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.println("Seja bem-vindo ao catálogo de pessoas");

		scanner = new Scanner(System.in);

		String continuar = "s";

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		do {

			System.out.println("\nDigite o nome:");
			String nome = scanner.nextLine();

			System.out.println("\nDigite a idade:");
			int idade = Integer.parseInt(scanner.nextLine());

			System.out.println("\nDigite a altura:");
			float altura = Float.parseFloat(scanner.nextLine());

			Pessoa pessoa = new Pessoa();
			pessoa.setIdade(idade);
			pessoa.setNome(nome);
			pessoa.setAltura(altura);

			pessoas.add(pessoa);

			System.out.println("\nDeseja cadastrar uma nova pessoa? (s/n)");
			continuar = scanner.nextLine();

		} while (!continuar.equals("n"));

		System.out.println("Pessoas cadastradas");
		
		
		System.out.println("Ordenadas pelo nome: ");
		pessoas.sort(new PessoaNomeComparator());
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Altura: " + pessoa.getAltura());
		}
		
		System.out.println("Ordenadas por idade: ");
		pessoas.sort(new PessoaIdadeComparator());
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Altura: " + pessoa.getAltura());
		}
		
		System.out.println("Ordenadas por altura: ");
		pessoas.sort(new PessoaAlturaComparator());
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Altura: " + pessoa.getAltura());
		}
		
	}
}
