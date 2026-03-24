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
public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        return preco; // Base: sem desconto ou imposto
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", calcularPrecoFinal());
    }
}
