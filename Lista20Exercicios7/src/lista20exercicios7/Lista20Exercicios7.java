/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios7;
import java.util.ArrayList;
/**
 *
 * @author aluno.saolucas
 */
public class Lista20Exercicios7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        
        formas.add(new Quadrado(5));
        formas.add(new Retangulo(4, 6));
        formas.add(new Circulo(3));
        formas.add(new Triangulo(4, 5));

        
        for (Forma f : formas) {
            System.out.println(f);
        }
    }
    }
    

