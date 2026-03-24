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
public class Boleto extends Pagamento {
    private String codigoBoleto;

    public Boleto(double valor, String data, String descricao, String codigoBoleto) {
        super(valor, data, descricao);
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Boleto...");
        System.out.println("Valor: R$ " + getValor() + " | Data: " + getData() + " | Código: " + codigoBoleto);
        System.out.println("Descrição: " + getDescricao());
    }
}
