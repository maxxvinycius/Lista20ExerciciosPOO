/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios11;

/**
 *
 * @author aluno.saolucas
 */
public class Dispositivo {
    private String nome;
    private String marca;
    private String modelo;
    private boolean ligado;
    
    public Dispositivo(String nome, String marca, String modelo, boolean ligado){
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }
         public void ligar() {
        ligado = true;
        System.out.println(nome + " está ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " está desligado.");
    }
    public boolean isLigado() {
    return ligado;
}
    public void executarFuncao() {
        System.out.println("Executando função genérica...");
    
}
}