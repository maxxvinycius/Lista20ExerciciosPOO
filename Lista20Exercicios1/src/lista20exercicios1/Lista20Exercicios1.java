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
public class Lista20Exercicios1 {

    
    public static void main(String[] args) {
         Animal a1 = new Cachorro("Rex", 3, 20.5);
        Animal a2 = new Gato("Mimi", 2, 5.0);
        Animal a3 = new Vaca("Mimosa", 5, 350.0);
        Animal a4 = new Cavalo("Pé de Pano", 4, 400.0);
        

        
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
        
    }
    
}
