/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sarinha
 */
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca() {}

    public ContaPoupanca(int numeroConta, String agencia, double saldo, Cliente cliente, double taxaRendimento) {
        super(numeroConta, agencia, saldo, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    //implementando metodo abstrato
    @Override
    public String getTipoConta() {
        return "POUPANCA";
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    // Getters e Setters
    public double getTaxaRendimento() { return taxaRendimento; }
    public void setTaxaRendimento(double taxaRendimento) { this.taxaRendimento = taxaRendimento; }

    @Override
    public String toString() {
        return super.toString() + ", ContaPoupanca{" +
                "taxaRendimento=" + taxaRendimento +
                '}';
    }
}
