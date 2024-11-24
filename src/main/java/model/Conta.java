/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Sarinha
 */
public abstract class Conta {
    private int numeroConta;
    private String agencia;
    private double saldo;
    private Cliente cliente;

    public Conta() {}

    public Conta(int numeroConta, String agencia, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // Métodos abstratos
    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);
    
    // Método abstrato para obter o tipo da conta
    public abstract String getTipoConta();

    // Getters e Setters
    public int getNumeroConta() { return numeroConta; }
    public void setNumeroConta(int numeroConta) { this.numeroConta = numeroConta; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
