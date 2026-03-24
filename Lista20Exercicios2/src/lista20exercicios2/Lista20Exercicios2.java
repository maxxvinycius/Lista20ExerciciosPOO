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
public class Lista20Exercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto m1 = new Moto("Kawasaki" ,"Ninja" , 2019 );
        Carro c1 = new Carro("Honda","Civic", 2022 );
        Bicicleta bic = new Bicicleta("Caloi","Elite 20", 2022);
        Onibus Oni = new Onibus("mercedez", "0-500", 2010);

        m1.mover();
        c1.mover();
        bic.mover();
        Oni.mover();
        
        
    }
    
}
