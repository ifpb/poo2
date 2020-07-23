
package br.edu.ifpb.poo2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.poo2.conexao.ConnectionFactory;
import br.edu.ifpb.poo2.model.Aluno;

public class AlunoDAO {
	
	private Connection connection = ConnectionFactory.getConnection();

	public List<Aluno> listarAlunos(int qtd) throws SQLException {
		String sql = "SELECT * FROM alunos LIMIT ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, qtd);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        List<Aluno> alunos = new ArrayList<>();
        while(resultSet.next()) {
            Long id = resultSet.getLong("id");
            String nome = resultSet.getString("nome");
            String matricula = resultSet.getString("matricula");
            Integer idade = resultSet.getInt("idade");
            Float cre = resultSet.getFloat("cre");
            Aluno aluno = new Aluno(id, nome, idade, matricula, cre);
            alunos.add(aluno);
        }
        return alunos;		
	}
	
	public void adicionarAluno(Aluno aluno) throws SQLException {
		String sql = "INSERT INTO alunos (nome, matricula, idade, cre) VALUES (?, ?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, aluno.getNome());
        statement.setString(2, aluno.getMatricula());
        statement.setInt(3, aluno.getIdade());
        statement.setFloat(4, aluno.getCre());
        statement.executeUpdate();
	}
	
	public void removerAluno(Aluno aluno) {
		
	}
	
	public void atualizarAluno(Aluno aluno) {
		
	}
	
}
