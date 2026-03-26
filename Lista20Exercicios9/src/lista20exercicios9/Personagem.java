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
public class Personagem {
    private String nome;
    private String classe;
    private int vida;
    private int nivel;
    
    public Personagem(String nome, String classe, int vida, int nivel){
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.nivel = nivel;
    
    
    }
    public String getNome(){
        return nome;
}
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getClasse(){
        return classe;
    }
    public void setClasse(String classe){
        this.classe = classe;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void atacar(){
        System.out.println("O personagem atacou!");
    }
    public void defender(){
        System.out.println("O personagem defendeu!");
    }
}