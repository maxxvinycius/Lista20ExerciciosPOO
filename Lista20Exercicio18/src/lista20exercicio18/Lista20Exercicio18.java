/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio18;

/**
 *
 * @author maxvi
 */
public class Lista20Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Casa casa = new Casa("Rua A", 200000, 120);
        Apartamento ap = new Apartamento("Av B", 300000, 80);
        Terreno terreno = new Terreno("Rua C", 100000, 200);
        SalaComercial sala = new SalaComercial("Centro", 400000, 150);

        System.out.println("Imposto Casa: " + casa.calcularImposto());
        System.out.println("Imposto Ap: " + ap.calcularImposto());
        System.out.println("Imposto Terreno: " + terreno.calcularImposto());
        System.out.println("Imposto Sala: " + sala.calcularImposto());
    }
    
}
