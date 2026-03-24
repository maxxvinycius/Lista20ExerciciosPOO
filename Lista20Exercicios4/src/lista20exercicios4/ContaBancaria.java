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
public class ContaBancaria {
    private int numero;
    private double saldo;
    private Cliente titular;

    public ContaBancaria(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saque não permitido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
