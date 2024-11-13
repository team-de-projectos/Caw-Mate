package com.cawmate.classes;

import com.cawmate.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pessoa {
    
    private String nome;
    private String nascimento;
    private String escolaridade;
    private String email;
    private String senha;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    public String getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /*
    - Inserção de dados
    - Obtenção de dados
    - Atualização de dados
    - Remoção de dados
    */
    
    public void inserir() {
        
        // Definir o comando SQL
        String sql = "INSERT INTO tb_pessoa(nome, nascimento, escolaridade, email, senha) VALUES (?, ?, ?, ?, ?)";
        // Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            // Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, nascimento);
            ps.setString(3, escolaridade);
            ps.setString(4, email);
            ps.setString(5, senha);
            // Executa o comando
            ps.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
