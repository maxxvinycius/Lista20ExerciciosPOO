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
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    // Rendimento simples de poupança
    public void renderJuros(double taxa) {
        double novoSaldo = getSaldo() * (1 + taxa/100);
        System.out.println("Saldo após rendimento: R$" + novoSaldo);
    }
}
