/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio20;

/**
 *
 * @author maxvi
 */
public class Leao extends Animal {

    public Leao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " rugindo: ROAAAR!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " comendo carne.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " correndo na savana.");
    }
}
