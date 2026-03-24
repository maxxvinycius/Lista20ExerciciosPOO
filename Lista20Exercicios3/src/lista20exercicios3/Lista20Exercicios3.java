/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios3;

/**
 *
 * @author aluno.saolucas
 */
public class Lista20Exercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente g = new Gerente("max", 5000, "Gerente");
        Vendedor v = new Vendedor("Carlos", 3000, "Vendedor");
        Programador p = new Programador("gabriel", 4200, "Programador");
        Designer d = new Designer("Laura", 3500, "Designer");
        
        g.trabalhar();
        v.trabalhar();
        p.trabalhar();
        d.trabalhar();
        
        System.out.println("");
        
        System.out.println(g.calcularBonus());
        System.out.println(v.calcularBonus()); 
        System.out.println(p.calcularBonus()); 
        System.out.println(d.calcularBonus()); 
    }
    
    
}
