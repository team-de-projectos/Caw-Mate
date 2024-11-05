
package com.mycompany.classes;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    private int codigo;
    private String nome;
    private String usuario;
    private String senha;
    private String email;
    private boolean tpUsuario;

    public Usuario() {
    }

    
    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    
    
    public Usuario(String nome, String usuario, String senha, String email, boolean tpUsuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.tpUsuario = tpUsuario;
    }
    

    public Usuario(int codigo, String nome, String usuario, String senha, String email, boolean tpUsuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.tpUsuario = tpUsuario;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTpUsuario() {
        return tpUsuario;
    }

    public void setTpUsuario(boolean tpUsuario) {
        this.tpUsuario = tpUsuario;
    }
    
    public boolean ValidaUsu() throws SQLException
    {
        String sql = "SELECT * FROM tb_usuario WHERE usuario = ? "
                + "AND senhausu= ?";
       
        ConnectionFactory cf = new ConnectionFactory();
       
        try(Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql);)
        {
        ps.setString(1, getUsuario());
        ps.setString(2, getSenha()); 
            System.out.println(sql);
            System.out.println(getUsuario());
            System.out.println(getSenha());
        ResultSet rs = ps.executeQuery();
        return rs.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Não Localizado!!");
            return false;
           
        }
    }
}