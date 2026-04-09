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
public class DVD extends ItemBiblioteca {

    public DVD(String titulo, int codigo) {
        super(titulo, codigo);
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            System.out.println("DVD emprestado por 5 dias.");
            setDisponivel(false);
        } else {
            System.out.println("DVD indisponível.");
        }
    }
}
