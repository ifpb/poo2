package br.edu.ifpb.poo2.model;

public class Aluno {

	public Aluno() {
	}
	
	public Aluno(Long id, String nome, Integer idade, String matricula, Float cre) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.cre = cre;
	}
	
	private Long id;
	private String nome;
	private String matricula;
	private Integer idade;
	private Float cre;
	
	
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Float getCre() {
		return cre;
	}
	public void setCre(Float cre) {
		this.cre = cre;
	}
	
}
