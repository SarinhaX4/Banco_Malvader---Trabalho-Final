/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Sarinha
 */
import dao.ContaDAO;
import model.Conta;

public class ContaController {
    private ContaDAO contaDAO;

    public ContaController() {
        this.contaDAO = new ContaDAO();
    }

    //metodo para consultar uma conta pelo numero
    public Conta consultarConta(int numeroConta) {
        try {
            return contaDAO.findByNumero(numeroConta);
        } catch (Exception e) {
            System.err.println("Erro ao consultar conta: " + e.getMessage());
            return null;
        }
    }
}
