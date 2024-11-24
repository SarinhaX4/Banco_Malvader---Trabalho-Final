/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Sarinha
 */
import model.Cliente;
import dao.ClienteDAO;

public class ClienteController {

    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    //metodo para cadastrar um novo cliente
    public boolean cadastrarCliente(Cliente cliente) {
        try {
            clienteDAO.save(cliente);
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
            return false;
        }
    }
    //metodo usamos para cunsultar os dados de um cliente
    public Cliente consultarCliente(String cpf) {
        try {
            return clienteDAO.findByCPF(cpf);
        } catch (Exception e) {
            System.err.println("Erro ao consultar cliente: " + e.getMessage());
            return null;
        }
    }

    //metodo usamos para atualizar dados de um cliente
    public boolean atualizarCliente(Cliente cliente) {
        try {
            clienteDAO.update(cliente);
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao atualizar cliente: " + e.getMessage());
            return false;
        }
    }
    //metodo para excluir um cliente do sistema
    public boolean excluirCliente(String cpf) {
        try {
            clienteDAO.deleteByCPF(cpf);
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao excluir cliente: " + e.getMessage());
            return false;
        }
    }
    
}

