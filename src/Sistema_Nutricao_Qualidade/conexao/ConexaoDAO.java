/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_nutricao_qualidade.conexao;

/**
 *
 * @author Juliana
 */
//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoDAO {

    Connection conn;

    private String url = "jdbc:mysql://localhost:3306/nutricao_qualidade_pi";
    private String usuario = "root";
    private String senha = "Anailuj1128*";

    //private Connection conexao;
    public Connection conectar() {
        try {
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso.");
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer a conexão: " + e.getMessage());
            return null;
        }
    }

    public void desconectar() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexão fechada com sucesso.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão: " + e.getMessage());
        }
    }

}
