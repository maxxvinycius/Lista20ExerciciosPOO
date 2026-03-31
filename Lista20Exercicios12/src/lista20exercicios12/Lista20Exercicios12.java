/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios12;

/**
 *
 * @author aluno.saolucas
 */
public class Lista20Exercicios12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Advogado a = new Advogado("max", "advocacia", 30000.0);
        a.executarTrabalho();
        System.out.println("");
        Medico m = new Medico("joao", "medicina", 50000.0);
        m.executarTrabalho();
        System.out.println("");
        Professor p = new Professor("miguel", "matemática", 5000.0);
        p.executarTrabalho();
        System.out.println("");
        Engenheiro e = new Engenheiro("barbara", "engenharia", 100000.0);
        e.executarTrabalho();
    }
    
}
