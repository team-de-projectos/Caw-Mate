
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

        private String usuario = "root";
        private String senha = "anima123";
        private String host = "localhost";        
        private String porta = "3306";        
        private String bd = "dbteste";
            public Connection obtemConexao(){
                try{
                    Connection c = DriverManager.getConnection("jbdc:mysql://"+ host + ":" + porta + "/"+ bd + "?serverTimezone=UTC", usuario,senha);
                    System.out.println("Conexão com sucesso!");
                    return c;
            }    
     catch (Exception e){
    e.printStackTrace();
    return null;
}
     }
}

