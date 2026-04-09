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
public class Macaco extends Animal {

    public Macaco(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " gritando: UH UH AH AH!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " comendo banana.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " pulando entre árvores.");
    }
}
