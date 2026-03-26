/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios9;

/**
 *
 * @author aluno.saolucas
 */
public class Mago extends Personagem{
    public Mago(String nome, String classe, int vida, int nivel){
        super(nome, classe, vida, nivel);
    }
    @Override
    public void atacar(){
        System.out.println("O mago ataca com sua bola de fogo.");
    }
    public void defender(){
        System.out.println("O mago defende.");
    }
}
