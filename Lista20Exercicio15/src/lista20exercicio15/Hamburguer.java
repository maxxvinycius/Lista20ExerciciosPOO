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
public class Hamburguer extends ItemCardapio {

    public Hamburguer(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Grelhando o hambúrguer...");
    }

    @Override
    public double calcularPreco() {
        return getPreco() + 3;
    }
}
