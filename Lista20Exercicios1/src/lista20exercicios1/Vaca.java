/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios1;

/**
 *
 * @author aluno.saolucas
 */
public class Vaca extends Animal {

    public Vaca(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca muge");
    }
}
