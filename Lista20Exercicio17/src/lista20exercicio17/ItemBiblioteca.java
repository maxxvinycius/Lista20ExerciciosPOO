/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio17;

/**
 *
 * @author maxvi
 */
public class ItemBiblioteca {
    private String titulo;
    private int codigo;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, int codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = true; // começa disponível
    }

    // getters e setters
    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Item emprestado com sucesso!");
        } else {
            System.out.println("Item indisponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Item devolvido com sucesso!");
    }
}