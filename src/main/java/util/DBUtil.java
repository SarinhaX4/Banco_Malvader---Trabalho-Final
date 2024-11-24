/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Sarinha
 */
import java.sql.Connection;
import java.sql.SQLException;
import dao.ConnectionFactory;

public class DBUtil {
    //metodo que abre uma nova conexao com o banco
    public static Connection conectar() throws SQLException {
        return ConnectionFactory.getConnection();
    }

    //metodopara encerrar a conexao com o banco
    public static void desconectar(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    //metodo que confirma ou relaiza um commit de transacao no banco
    public static void commit(Connection conexao) throws SQLException {
        if (conexao != null) {
            try {
                conexao.commit();
            } catch (SQLException e) {
                System.err.println("Erro ao realizar commit: " + e.getMessage());
                throw e;
            }
        }
    }

    //metodo para desfazer uma trasacao no banco
    public static void rollback(Connection conexao) throws SQLException {
        if (conexao != null) {
            try {
                conexao.rollback();
            } catch (SQLException e) {
                System.err.println("Erro ao realizar rollback: " + e.getMessage());
                throw e;
            }
        }
    }

    //metodo para configurar o modo de autocommit da conexao
    public static void setAutocommit(Connection conexao, boolean autocommit) throws SQLException {
        if (conexao != null) {
            try {
                conexao.setAutoCommit(autocommit);
            } catch (SQLException e) {
                System.err.println("Erro ao configurar autocommit: " + e.getMessage());
                throw e;
            }
        }
    }
}
