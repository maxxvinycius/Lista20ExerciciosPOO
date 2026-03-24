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
public class Pix extends Pagamento {
    private String chavePix;

    public Pix(double valor, String data, String descricao, String chavePix) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Pix...");
        System.out.println("Valor: R$ " + getValor() + " | Data: " + getData() + " | Chave Pix: " + chavePix);
        System.out.println("Descrição: " + getDescricao());
    }
}
