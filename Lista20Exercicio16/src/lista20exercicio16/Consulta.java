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
public class Consulta {
    private Paciente paciente;
    private Pessoa profissional; // polimorfismo aqui
    private String data;

    public Consulta(Paciente paciente, Pessoa profissional, String data) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada para " + data);
    }

    public void exibirDados() {
        System.out.println("=== Consulta ===");
        paciente.exibirDados();
        profissional.exibirDados();
    }

    public void realizarAtendimento() {
        if (profissional instanceof Medico) {
            ((Medico) profissional).realizarAtendimento();
        } else if (profissional instanceof Enfermeiro) {
            ((Enfermeiro) profissional).realizarAtendimento();
        }
    }
}
