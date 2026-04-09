/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio15;

/**
 *
 * @author maxvi
 */
public class Lista20Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Pizza pizza = new Pizza("Calabresa", 30, "Pizza com calabresa");
        Hamburguer burguer = new Hamburguer("X-Burguer", 20, "Com queijo");
        Bebida bebida = new Bebida("Coca-Cola", 8, "Lata 350ml");
        Sobremesa doce = new Sobremesa("Pudim", 10, "Leite condensado");

        pizza.preparar();
        System.out.println("Preço: " + pizza.calcularPreco());

        burguer.preparar();
        System.out.println("Preço: " + burguer.calcularPreco());

        bebida.preparar();
        System.out.println("Preço: " + bebida.calcularPreco());

        doce.preparar();
        System.out.println("Preço: " + doce.calcularPreco());
    }
}
    
