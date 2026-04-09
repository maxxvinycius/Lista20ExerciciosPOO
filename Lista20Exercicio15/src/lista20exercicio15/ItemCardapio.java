/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio15;

/**
 *
 * @author maxvi
 */
public class ItemCardapio {
    private String nome;
    private double preco;
    private String descricao;

    public ItemCardapio(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void preparar() {
        System.out.println("Preparando item...");
    }

    public double calcularPreco() {
        return preco;
    }
}
