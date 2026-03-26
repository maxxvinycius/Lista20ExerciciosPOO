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
public class Taxi extends Transporte{
    public Taxi(int capacidade, String empresa, double tarifaBase){
        super(capacidade, empresa, tarifaBase);
}
    @Override
   public double calcularTarifa(){
        double tarifa = getTarifaBase() + 10;
        return tarifa;
    }
}

