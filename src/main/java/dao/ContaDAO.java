/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Sarinha
 */
//
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import dao.ClienteDAO;

public class ContaDAO {

    //metodo para buscar uma conta pelo numero da conta
    public Conta findByNumero(int numeroConta) throws SQLException {
        String sql = "SELECT * FROM conta WHERE numero_conta = ?";
        
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, numeroConta);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                //informçoes comuns para ambas as contas
                String agencia = rs.getString("agencia");
                double saldo = rs.getDouble("saldo");
                String tipoConta = rs.getString("tipo_conta");
                int idCliente = rs.getInt("id_cliente");

                //buscar o cliente associado
                ClienteDAO clienteDAO = new ClienteDAO();
                Cliente cliente = clienteDAO.findById(idCliente);

                //verifica o tipo da conta e cria a instância correspondente
                if ("CORRENTE".equalsIgnoreCase(tipoConta)) {
                    double limite = rs.getDouble("limite");
                    java.sql.Date dataVencimentoSQL = rs.getDate("data_vencimento");
                    LocalDate dataVencimento = dataVencimentoSQL != null ? dataVencimentoSQL.toLocalDate() : null;

                    return new ContaCorrente(numeroConta, agencia, saldo, cliente, limite, dataVencimento);
                } else if ("POUPANCA".equalsIgnoreCase(tipoConta)) {
                    double taxaRendimento = rs.getDouble("taxa_rendimento");
                    return new ContaPoupanca(numeroConta, agencia, saldo, cliente, taxaRendimento);
                }
            }
        }
        return null;//se a conta n for encontrada retorna null
    }
}
