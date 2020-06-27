/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.alunos.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diegopessoa
 */
public class AlunoDAO {
    
    private Connection connection;
    
    public AlunoDAO() {
        try {
            connection = JDBCFactory.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, "Falha ao conectar com o banco", ex);
        }
    }
    
    public void inserirAluno(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO alunos (nome, matricula, curso, situacao) VALUES (?, ?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, aluno.getNome());
        statement.setString(2, aluno.getMatricula());
        statement.setString(3, aluno.getCurso());
        statement.setString(4, aluno.getSituacao());
        statement.executeUpdate();
    }
    
    public List<Aluno> listarAlunos(int qtd) throws SQLException {
        String sql = "SELECT * FROM alunos LIMIT ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, qtd);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        List<Aluno> alunos = new ArrayList<>();
        while(resultSet.next()) {
            String nome = resultSet.getString("nome");
            String matricula = resultSet.getString("matricula");
            String curso = resultSet.getString("curso");
            String situacao = resultSet.getString("situacao");
            Aluno aluno = new Aluno(nome, matricula, curso, situacao);
            alunos.add(aluno);
        }
        return alunos;
    }
    
}
