/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios8;

/**
 *
 * @author aluno.saolucas
 */
public class Dinheiro extends Pagamento {
    public Dinheiro(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento em dinheiro...");
        System.out.println("Valor: R$ " + getValor() + " | Data: " + getData());
        System.out.println("Descrição: " + getDescricao());
    }
}
