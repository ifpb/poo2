/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.alunos.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diegopessoa
 */
public class JDBCFactory {
    
    private static Connection instance;
    
    private JDBCFactory() {
    }
    
    public synchronized static Connection getConnection() throws SQLException {
        if (instance == null) {
            instance = DriverManager.getConnection("jdbc:postgresql://localhost:5432/alunos", "admin", "123");
        }
        return instance;
    }
    
}
