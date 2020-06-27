/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.alunos.controller;

import br.edu.ifpb.alunos.model.Aluno;
import br.edu.ifpb.alunos.model.AlunoDAO;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author diegopessoa
 */
public class AlunoService {
    
    private AlunoDAO alunoDAO = new AlunoDAO();
    
    public AlunoService() {
        importarAlunos();
    }
    
    public List<Aluno> listarAlunos(int qtd) {
        List<Aluno> alunos = new ArrayList<>();
        try {
            alunos = alunoDAO.listarAlunos(qtd);
        } catch (SQLException ex) {
            Logger.getLogger(AlunoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alunos;
    }
    
    private void importarAlunos() {
        try {
            Stream<String> linhas = Files.lines(Paths.get(ClassLoader.getSystemResource("alunos.csv").toURI()));

            List<Aluno> alunos = linhas
                    .skip(1)
                    .map( (l) -> l.split(","))
                    .map( (l) -> new Aluno(l[0], l[1], l[2], l[3]))
                    .collect(Collectors.toList());
            
            for(Aluno aluno : alunos) {
                try {
                    // Salvar no banco cada aluno
                    alunoDAO.inserirAluno(aluno);
                } catch (SQLException ex) {
                    Logger.getLogger(AlunoService.class.getName()).log(Level.SEVERE, "Falha ao inserir alunos", ex);
                }
            }
        
        } catch(IOException | URISyntaxException e) {
            Logger.getLogger(AlunoService.class.getName()).log(Level.SEVERE, "Falha ao ler arquivo contendo dados de alunos", e);
        }
    }
    
//    public static void main(String[] args) {
//        
//        AlunoService alunoService = new AlunoService();
////        alunoService.importarAlunos();
//        
//        List<Aluno> lista = alunoService.listarAlunos(10);
//        lista.stream().forEach(System.out::println);
//        
//    }
    
}
