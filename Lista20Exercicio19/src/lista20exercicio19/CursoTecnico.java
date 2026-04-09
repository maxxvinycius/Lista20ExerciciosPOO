/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio19;

/**
 *
 * @author maxvi
 */
public class CursoTecnico extends Curso {

    public CursoTecnico(String nome, int cargaHoraria, double valor) {
        super(nome, cargaHoraria, valor);
    }

    @Override
    public double calcularMensalidade() {
        return getValor() + 150;
    }
}
