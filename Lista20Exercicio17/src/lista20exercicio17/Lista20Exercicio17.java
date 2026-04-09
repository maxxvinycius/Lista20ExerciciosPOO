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
public class Lista20Exercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Livro livro = new Livro("Java Básico", 1);
        Revista revista = new Revista("Tech News", 2);
        Jornal jornal = new Jornal("Diário", 3);
        DVD dvd = new DVD("Filme Ação", 4);

        livro.emprestar();
        livro.devolver();

        revista.emprestar();

        jornal.emprestar();

        dvd.emprestar();
        dvd.emprestar(); // testar indisponível
    }
}
