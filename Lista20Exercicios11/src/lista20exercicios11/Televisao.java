/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios11;

/**
 *
 * @author aluno.saolucas
 */
public class Televisao extends Dispositivo{
    public Televisao(String nome, String marca, String modelo, boolean ligado){
        super(nome, marca, modelo, ligado);
    }
    @Override
    public void executarFuncao(){
        if(isLigado()){
            System.out.println("televisao ligada: assistindo série");
        }else{
            System.out.println("televisao desligando");
            
        }
    }
}
