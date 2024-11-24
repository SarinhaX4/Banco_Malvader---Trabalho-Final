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
public class Cliente extends Usuario {
    private String senha;

    public Cliente() {}

    public Cliente(int id, String nome, String cpf, LocalDate dataNascimento, String telefone, String senha) {
        super(id, nome, cpf, dataNascimento, telefone);
        this.senha = senha;
    }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    @Override
    public String toString() {
        return super.toString() + ", Cliente{" +
                "senha='***'" +
                '}';
    }
}
