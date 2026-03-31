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
public class Lista20Exercicios11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador c = new Computador("titan", "lenovo", "C-0", false);
        c.desligar();
        System.out.println("");
        Smartphone s = new Smartphone("Leviatã", "iphone", "gg", true);
        s.ligar();
        System.out.println("");
        Televisao t = new Televisao("babiromet", "lg", "k-32", true);
        t.ligar();
        System.out.println("");
        Tablet tab = new Tablet("malomé", "samsung", "i-88", false);
        tab.desligar();
    }
    
}
