/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Pires
 */
public class Supermercado {

    public static void main(String[] args) {

        final Cliente clienteTeste = new Cliente();
        clienteTeste.getnome();
        clienteTeste.getcpf();
        clienteTeste.getidade();

        final Produto produtomacarrão = new Produto();
        produtomacarrão.getNome();
        produtomacarrão.getQtde_estoque();
        produtomacarrão.valorProduto = 18.50;
        produtomacarrão.alteraValor(18.10);

        final Pedido pedidoFinal = new Pedido();
        pedidoFinal.getCodigo();
        pedidoFinal.getCliente();
        pedidoFinal.getProdutos();

    }

}
