/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio16;

/**
 *
 * @author maxvi
 */
public class Lista20Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente p = new Paciente("João", 30, "Gripe");
        Medico m = new Medico("Dr. Carlos", 45, "Clínico Geral");
        Enfermeiro e = new Enfermeiro("Ana", 35, "Emergência");

        Consulta c1 = new Consulta(p, m, "10/04");
        Consulta c2 = new Consulta(p, e, "11/04");

        c1.agendarConsulta();
        c1.exibirDados();
        c1.realizarAtendimento();

        System.out.println();

        c2.agendarConsulta();
        c2.exibirDados();
        c2.realizarAtendimento();
    }
}
    
    

