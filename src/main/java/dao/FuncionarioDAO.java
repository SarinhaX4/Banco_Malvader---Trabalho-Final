/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Sarinha
 */
import model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {

    //metodo que usamos para salvar um novo funcionario no banco
    public void save(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (codigo_funcionario, cargo, nome, cpf, data_nascimento, telefone, senha) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, funcionario.getCodigoFuncionario());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getNome());
            stmt.setString(4, funcionario.getCpf());
            stmt.setDate(5, java.sql.Date.valueOf(funcionario.getDataNascimento()));
            stmt.setString(6, funcionario.getTelefone());
            stmt.setString(7, funcionario.getSenha());

            stmt.executeUpdate();
        }
    }

    //metodo que usamos para buscar um funcionario pelo codigo
    public Funcionario findByCodigo(String codigoFuncionario) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE codigo_funcionario = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, codigoFuncionario);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigoFuncionario(rs.getString("codigo_funcionario"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setSenha(rs.getString("senha"));
                return funcionario;
            }
        }
        return null;
    }

    //metodo para atualizar os dados de um funcionario no banco
    public void update(Funcionario funcionario) throws SQLException {
        String sql = "UPDATE funcionario SET cargo = ?, nome = ?, telefone = ? WHERE codigo_funcionario = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, funcionario.getCargo());
            stmt.setString(2, funcionario.getNome());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getCodigoFuncionario());

            stmt.executeUpdate();
        }
    }

    //metodo que exclui um funcionario pelo codigo
    public void deleteByCodigo(String codigoFuncionario) throws SQLException {
        String sql = "DELETE FROM funcionario WHERE codigo_funcionario = ?";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, codigoFuncionario);
            stmt.executeUpdate();
        }
    }
}

