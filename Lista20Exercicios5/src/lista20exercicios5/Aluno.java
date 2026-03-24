/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios5;



public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String cpf, int idade, double nota1, double nota2, double nota3) {
        super(nome, cpf, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o aluno " + getNome());
    }

    @Override
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Getters (opcional)
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }
}
