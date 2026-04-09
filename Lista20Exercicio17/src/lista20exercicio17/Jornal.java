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
public class Jornal extends ItemBiblioteca {

    public Jornal(String titulo, int codigo) {
        super(titulo, codigo);
    }

    @Override
    public void emprestar() {
        System.out.println("Jornais não podem ser emprestados, apenas leitura local.");
    }
}
