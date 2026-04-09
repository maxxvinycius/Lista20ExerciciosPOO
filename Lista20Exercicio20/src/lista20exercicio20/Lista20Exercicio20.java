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
public class Lista20Exercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal[] animais = new Animal[4];

        animais[0] = new Leao("Simba", 5, 190);
        animais[1] = new Macaco("George", 3, 25);
        animais[2] = new Elefante("Dumbo", 10, 500);
        animais[3] = new Papagaio("Loro", 2, 1);

        for (Animal a : animais) {
            System.out.println("----");
            a.emitirSom();
            a.alimentar();
            a.movimentar();
        }
    }
}