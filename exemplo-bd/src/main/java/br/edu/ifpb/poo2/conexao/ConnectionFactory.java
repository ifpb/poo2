package br.edu.ifpb.poo2.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection conexao;
	
	private ConnectionFactory() {}
	
	public static Connection getConnection() {
		
		if (conexao == null) {
			try {
				conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/alunos", "admin", "123");
			} catch (SQLException e) {
				System.err.print("Falha ao conectar com o banco de dados");
				e.printStackTrace();
			}
		}
		
		return conexao;
	}

}
