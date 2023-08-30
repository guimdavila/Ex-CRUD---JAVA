
package CONEXAO_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class banco_dados_mysql {
    
    // Configurar a conexão com o banco 
    
    public Connection conexao = null;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String nomeBanco = "empresa";
    private final String local = "jdbc:mysql://localhost:3306/"+nomeBanco;
    private final String usuario = "root";
    private final String senha = "root";
    
    public boolean getConnection(){
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(local,usuario,senha);
            System.out.println("Banco de dados conectado :)");
            return true;

        }
        catch(ClassNotFoundException erro){
            System.out.println("Drive do Mysql não encontrado :( " + erro.toString());
            return false;
        } 
        catch(SQLException erro2){
            System.out.println("Falha na conexão :( " + erro2.toString());
        }
        return false;   
    }
    
}
