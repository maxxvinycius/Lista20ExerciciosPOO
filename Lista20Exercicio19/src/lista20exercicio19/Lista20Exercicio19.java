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
public class Lista20Exercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         CursoPresencial presencial = new CursoPresencial("Java", 60, 500);
        CursoOnline online = new CursoOnline("Python", 40, 400);
        CursoTecnico tecnico = new CursoTecnico("Informática", 80, 600);
        CursoLivre livre = new CursoLivre("Excel", 20, 200);

        presencial.exibirInformacoes();
        System.out.println("Mensalidade: " + presencial.calcularMensalidade());

        System.out.println();

        online.exibirInformacoes();
        System.out.println("Mensalidade: " + online.calcularMensalidade());

        System.out.println();

        tecnico.exibirInformacoes();
        System.out.println("Mensalidade: " + tecnico.calcularMensalidade());

        System.out.println();

        livre.exibirInformacoes();
        System.out.println("Mensalidade: " + livre.calcularMensalidade());
    }
    
}
