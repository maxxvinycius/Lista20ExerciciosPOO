/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios6;

/**
 *
 * @author aluno.saolucas
 */
public class Venda {
    private Cliente cliente;
    private Produto produto;

    public Venda(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() + " | Produto: " + produto;
    }
}
