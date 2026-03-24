/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios7;

/**
 *
 * @author aluno.saolucas
 */
public abstract class Forma {
    // Atributos privados
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato para polimorfismo
    public abstract double calcularArea();

    @Override
    public String toString() {
        return nome + " - Área: " + String.format("%.2f", calcularArea());
    }
}
