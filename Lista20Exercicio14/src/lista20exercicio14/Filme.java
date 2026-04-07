/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio14;

/**
 *
 * @author maxvi
 */
public class Filme extends Midia{
    public Filme(String titulo, String duracao, String autor){
        super(titulo, duracao, autor);
        
    }
    @Override
    public void reproduzir(){
        System.out.println("reproduzindo filme");
    }
}
