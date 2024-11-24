/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Sarinha
 */
public class Funcionario extends Usuario {
    private String codigoFuncionario;
    private String cargo;
    private String senha;

    public Funcionario() {}

    public Funcionario(int id, String nome, String cpf, LocalDate dataNascimento, String telefone, String codigoFuncionario, String cargo, String senha) {
        super(id, nome, cpf, dataNascimento, telefone); 
        this.codigoFuncionario = codigoFuncionario;
        this.cargo = cargo;
        this.senha = senha;
    }

    public String getCodigoFuncionario() { return codigoFuncionario; }
    public void setCodigoFuncionario(String codigoFuncionario) { this.codigoFuncionario = codigoFuncionario; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    @Override
    public String toString() {
        return super.toString() + ", Funcionario{" +
                "codigoFuncionario='" + codigoFuncionario + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
