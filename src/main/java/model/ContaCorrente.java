/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sarinha
 */
import java.time.LocalDate;

public class ContaCorrente extends Conta {
    private double limite;
    private LocalDate dataVencimento;

    public ContaCorrente() {}

    public ContaCorrente(int numeroConta, String agencia, double saldo, Cliente cliente, double limite, LocalDate dataVencimento) {
        super(numeroConta, agencia, saldo, cliente);
        this.limite = limite;
        this.dataVencimento = dataVencimento;
    }

    //implementando o metodo abstrato
    @Override
    public String getTipoConta() {
        return "CORRENTE";
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    //getters e setters
    public double getLimite() { return limite; }
    public void setLimite(double limite) { this.limite = limite; }

    public LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }

    @Override
    public String toString() {
        return super.toString() + ", ContaCorrente{" +
                "limite=" + limite +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}

