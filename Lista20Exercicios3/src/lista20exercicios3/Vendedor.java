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
public class Vendedor extends Funcionario{
    public Vendedor(String nome, double salario, String cargo){
        super(nome, salario, cargo);
        
}
    @Override
    public void trabalhar(){
        System.out.println("O vendedor está vendendo produtos");
    }
    public double calcularBonus() {
        return getSalario() * 0.15;
}
}
