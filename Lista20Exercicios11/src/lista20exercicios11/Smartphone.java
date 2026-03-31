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
public class Smartphone extends Dispositivo{
    public Smartphone(String nome, String marca, String modelo, boolean ligado){
        super(nome, marca, modelo, ligado);
        
    }
    @Override
    public void executarFuncao(){
        if(isLigado()){
            System.out.println("Smartphone ligado: abrindo aplicativos..");
        }else{
            System.out.println("O smartphone está desligando");
        }
    }
}
