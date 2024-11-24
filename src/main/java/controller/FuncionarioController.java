/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Sarinha
 */
import model.Funcionario;
import dao.FuncionarioDAO;

public class FuncionarioController {

    private FuncionarioDAO funcionarioDAO;

    public FuncionarioController() {
        this.funcionarioDAO = new FuncionarioDAO(); //inicializamos o dao para ligar com o banco
    }                                                   

    //metodo para cadastrar novo funcionario
    public boolean cadastrarFuncionario(Funcionario funcionario) {
        try {
            funcionarioDAO.save(funcionario);
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar funcionário: " + e.getMessage());
            return false;
        }
    }

    //metodo para consultar os dados de um funcionario
    public Funcionario consultarFuncionario(String codigoFuncionario) {
        try {
            return funcionarioDAO.findByCodigo(codigoFuncionario);
        } catch (Exception e) {
            System.err.println("Erro ao consultar funcionário: " + e.getMessage());
            return null;
        }
    }

    //metodo que atualiza os dados do funcionario
    public boolean atualizarFuncionario(Funcionario funcionario) {
        try {
            funcionarioDAO.update(funcionario);
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao atualizar funcionário: " + e.getMessage());
            return false;
        }
    }

    //metodo para excluir um funcionario do sistema
    public boolean excluirFuncionario(String codigoFuncionario) {
        try {
            funcionarioDAO.deleteByCodigo(codigoFuncionario);
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao excluir funcionário: " + e.getMessage());
            return false;
        }
    }
}

