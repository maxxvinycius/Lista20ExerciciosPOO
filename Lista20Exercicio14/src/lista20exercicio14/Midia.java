/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio14;

/**
 *
 * @author maxvi
 */
public class Midia {
     private String titulo;
    private String duracao;
    private String autor;

    public Midia(String titulo, String duracao, String autor){
        this.titulo = titulo;
        this.duracao = duracao;
        this.autor = autor;
        
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDuracao(){
        return duracao;
    }
    public String getAutor(){
        return autor;
    }
    public void reproduzir(){
        System.out.println("reproduzindo...");
    }
}
