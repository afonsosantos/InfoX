/*
 * InfoX - Sistema de Gestão de Ordens de Serviço
 * Desenvolvido por Afonso Santos
 * Sob licença GPL (General Public License)
 */
package pt.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Afonso
 */
public class ModuloConexao {
    // método responsável por estabelecer a conexão com o banco de dados

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // informações referentes ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // estabelecendo a conexão ao banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // linha de apoio ao erro
            // System.out.println(e);
            return null;
        }
    }
}
