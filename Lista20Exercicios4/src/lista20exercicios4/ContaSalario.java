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
public class ContaSalario extends ContaBancaria {

    public ContaSalario(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void sacar(double valor) {
        // Limite de saque para conta salário, exemplo
        if (valor <= 2000 && valor <= getSaldo()) {
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saque não permitido na conta salário.");
        }
    }
}
