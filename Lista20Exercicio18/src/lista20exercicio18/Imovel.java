/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio18;

/**
 *
 * @author maxvi
 */
public class Imovel {
    private String endereco;
    private double preco;
    private double metragem;

    public Imovel(String endereco, double preco, double metragem) {
        this.endereco = endereco;
        this.preco = preco;
        this.metragem = metragem;
    }

    // getters
    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public double getMetragem() {
        return metragem;
    }

    public double calcularImposto() {
        return preco * 0.01; 
    }
}
