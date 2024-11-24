/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Sarinha
 */
import java.sql.Connection;

public class TestarConexao {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Usando o método getConnection da ConnectionFactory
            conn = ConnectionFactory.getConnection();
            System.out.println("Conexão bem-sucedida!");
        } catch (Exception e) {
            System.err.println("Erro na conexão: " + e.getMessage());
        } finally {
            // Garantindo que a conexão será fechada
            ConnectionFactory.desconectar(conn);
        }
    }
}


