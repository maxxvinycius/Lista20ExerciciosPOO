/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios10;

/**
 *
 * @author aluno.saolucas
 */
public class Lista20Exercicios10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metro m = new Metro(400, "trensurb", 30.4);
        Taxi t = new Taxi(3, "taxismo", 10.5);
        Onibus o = new Onibus(45, "trensurb", 15.3);
        Uber u = new Uber(3, "uber", 22.6);
        
        System.out.println(m.getCapacidade() + "-" + m.getEmpresa() + "-" + m.getTarifaBase());
        System.out.println(t.getCapacidade() + "-" + t.getEmpresa() + "-" + t.getTarifaBase());
        System.out.println(o.getCapacidade() + "-" + o.getEmpresa() + "-" + o.getTarifaBase());
        System.out.println(u.getCapacidade() + "-" + u.getEmpresa() + "-" + u.getTarifaBase());
        System.out.println("");
        m.calcularTarifa();
                t.calcularTarifa();
                o.calcularTarifa();
                u.calcularTarifa();
    }
    
}
