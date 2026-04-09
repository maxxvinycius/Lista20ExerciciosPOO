/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio19;

/**
 *
 * @author maxvi
 */
public class Curso {
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(String nome, int cargaHoraria, double valor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + "h");
        System.out.println("Valor: R$ " + valor);
    }

    public double calcularMensalidade() {
        return valor; 
    }
}
