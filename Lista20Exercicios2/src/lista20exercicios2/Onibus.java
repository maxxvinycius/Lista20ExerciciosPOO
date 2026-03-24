/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios2;

/**
 *
 * @author aluno.saolucas
 */
public class Onibus extends Veiculo{
    public Onibus(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }
    @Override
    public void mover(){
        System.out.println("O Onibus está em operaçao");
}
}
