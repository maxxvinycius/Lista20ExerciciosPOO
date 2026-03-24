/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios4;

/**
 *
 * @author aluno.saolucas
 */
public class Lista20Exercicios4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Cliente c1 = new Cliente("João", "123.456.789-00");
        Cliente c2 = new Cliente("Maria", "987.654.321-00");

        ContaBancaria cc = new ContaCorrente(101, c1, 500);
        ContaBancaria cp = new ContaPoupanca(102, c2);
        ContaBancaria cs = new ContaSalario(103, c1);

        cc.depositar(1000);
        cp.depositar(2000);
        cs.depositar(1500);

        cc.sacar(1200); // usa limite
        cp.sacar(100);  // normal
        cs.sacar(2500); // não permitido

        cc.consultarSaldo();
        cp.consultarSaldo();
        cs.consultarSaldo();
    }
}
    }
    

