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
public class Lista20Exercicios9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("max", "Guerreiro", 100, 50);
        Arqueiro a = new Arqueiro("miguel", "Arqueiro", 89, 75);
        Paladino p = new Paladino("joão", "Paladino", 44, 88);
        Mago m = new Mago("matheus", "Mago", 13, 99);
        
        System.out.println(g.getNome() + " - " + g.getClasse() + " - Vida: " + g.getVida() + " - Nivel: " + g.getNivel());
System.out.println(a.getNome() + " - " + a.getClasse() + " - Vida: " + a.getVida() + " - Nivel: " + a.getNivel());
System.out.println(p.getNome() + " - " + p.getClasse() + " - Vida: " + p.getVida() + " - Nivel: " + p.getNivel());
System.out.println(m.getNome() + " - " + m.getClasse() + " - Vida: " + m.getVida() + " - Nivel: " + m.getNivel());
        System.out.println("");
        
        g.atacar();
        g.defender();
        System.out.println("");
        a.atacar();
        a.defender();
        System.out.println("");
        p.atacar();
        p.defender();
        System.out.println("");
        m.atacar();
        m.defender();
        
        
       
    }
    
}
