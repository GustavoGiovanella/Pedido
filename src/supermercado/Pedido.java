/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Arrays;

public class Pedido {

    private String codigo = "";
    private Produto[] produtos = new Produto[0];
    private Cliente cliente;

    void adicionarProduto(Produto novoProduto) {
        produtos = Arrays.copyOf(this.produtos, produtos.length + 1);
        produtos[produtos.length + 1] = novoProduto;
    }

    double valorTotal() {
        double somaTotal = 0;
        for (int i = 0; i < produtos.length; i++) {
            somaTotal = somaTotal + produtos[i].getValorProduto();
        }
        return somaTotal;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Produto[] getProdutos() {
        return this.produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
