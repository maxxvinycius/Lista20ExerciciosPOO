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
public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.10; 
    }
}
