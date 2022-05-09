/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author CEDUP06
 */
public class Cliente {

    private String nome;
    private String cpf;
    private int idade;

    Cliente(String nome, String cpf, int idade) {
       
    }

    Cliente() {

    }

    String getnome() {
        return this.nome;
    }

    void setnome(String nome) {
        this.nome = nome;
    }

    String getcpf() {
        return this.cpf;
    }

    void setcpf(String cpf) {
        this.cpf = cpf;
    }

    int getidade() {
        return this.idade;
    }

    void setidade(int idade) {
        this.idade = idade;
    }
}
