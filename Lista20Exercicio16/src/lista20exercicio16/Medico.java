/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio16;

/**
 *
 * @author maxvi
 */
public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void realizarAtendimento() {
        System.out.println("Médico atendendo paciente...");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Especialidade: " + especialidade);
    }
}
