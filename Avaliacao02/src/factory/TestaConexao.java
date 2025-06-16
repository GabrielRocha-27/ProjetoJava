package factory;

import java.sql.Connection; // <--- necessário!
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = factory.ConnectionFactory.getConnection(); // OK: presume que você criou essa classe
            System.out.println("Conexão bem-sucedida!");
            con.close(); // OK: sempre bom fechar
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
