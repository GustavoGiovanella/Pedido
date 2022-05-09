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
public class Produto {

    double valorProduto;
    private int qtde_estoque;
    private String nome;

    void alteraValor(double valorMercado) {
        valorProduto = valorMercado;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQtde_estoque() {
        return qtde_estoque;
    }

    void setQtde_estoque(int qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

}
