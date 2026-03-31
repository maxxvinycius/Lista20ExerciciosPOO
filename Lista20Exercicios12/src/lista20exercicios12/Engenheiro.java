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
public class Engenheiro extends Profissao{
    public Engenheiro(String nome, String area, double salario){
        super(nome, area, salario);
    }
    @Override
    public void executarTrabalho(){
        System.out.println("O engenheiro está construindo");
    }
}
