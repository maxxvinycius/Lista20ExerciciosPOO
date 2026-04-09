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
public class Sobremesa extends ItemCardapio {

    public Sobremesa(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Montando a sobremesa...");
    }

    @Override
    public double calcularPreco() {
        return getPreco() + 2;
    }
}
