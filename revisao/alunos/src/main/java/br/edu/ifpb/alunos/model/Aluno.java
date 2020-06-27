/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.alunos.model;

/**
 *
 * @author diegopessoa
 */
public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String situacao;

    public Aluno() {
    }
    
    public Aluno(String nome, String matricula, String curso, String situacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.situacao = situacao;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", situacao=" + situacao + '}';
    }
    
    
}
