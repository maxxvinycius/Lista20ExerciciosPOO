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
public class Profissao {
    private String nome;
    private String area;
    private double salario;
    
    public Profissao(String nome, String area, double salario){
        this.area = area;
        this.nome = nome;
        this.salario = salario;
        
    }
    public void executarTrabalho(){
        System.out.println("Projetando e construindo soluções..");
    }
    
}
