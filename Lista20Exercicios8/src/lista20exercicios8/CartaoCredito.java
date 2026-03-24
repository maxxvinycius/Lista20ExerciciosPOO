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
public class CartaoCredito extends Pagamento {
    private String numeroCartao;

    public CartaoCredito(double valor, String data, String descricao, String numeroCartao) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento no cartão de crédito...");
        System.out.println("Valor: R$ " + getValor() + " | Data: " + getData() + " | Cartão: ****" + numeroCartao.substring(numeroCartao.length()-4));
        System.out.println("Descrição: " + getDescricao());
    }
}
