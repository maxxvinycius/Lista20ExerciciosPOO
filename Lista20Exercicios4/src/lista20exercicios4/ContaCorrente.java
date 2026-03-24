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
public class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente(int numero, Cliente titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            System.out.println("Saque de R$" + valor + " realizado com limite.");
        } else {
            System.out.println("Saque não permitido, ultrapassa limite.");
        }
    }
}
