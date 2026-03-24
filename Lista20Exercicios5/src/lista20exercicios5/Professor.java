package lista20exercicios5;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, int idade, String disciplina) {
        super(nome, cpf, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o professor " + getNome() + " de " + disciplina);
    }

    @Override
    public double calcularMedia() {
        // Professores não têm média → retorna 0
        return 0;
    }

    public String getDisciplina() { return disciplina; }
}
