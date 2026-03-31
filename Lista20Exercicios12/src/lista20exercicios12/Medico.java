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
public class Medico extends Profissao{
    public Medico(String nome, String area, double salario){
        super(nome, area, salario);
        
    }
    @Override
    public void executarTrabalho(){
        System.out.println("O medico esta cuidando do paciente");
    }
}
