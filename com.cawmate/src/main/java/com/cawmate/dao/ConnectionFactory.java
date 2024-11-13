package com.cawmate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "anima123";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "cawmate";
    
    public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection (
            "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?serverTimezone=UTC", usuario, senha
            );
            System.out.println("Executado com sucesso!");
                return c;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
