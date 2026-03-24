package lista20exercicios5;

import java.util.List;

public class Turma {
    private String nomeTurma;
    private Professor professor;
    private Coordenador coordenador;
    private List<Aluno> alunos;

    public Turma(String nomeTurma, Professor professor, Coordenador coordenador, List<Aluno> alunos) {
        this.nomeTurma = nomeTurma;
        this.professor = professor;
        this.coordenador = coordenador;
        this.alunos = alunos;
    }

    public void apresentarTurma() {
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Professor: " + professor.getNome() + " (" + professor.getDisciplina() + ")");
        System.out.println("Coordenador: " + coordenador.getNome() + " (" + coordenador.getSetor() + ")");
        System.out.println("Alunos:");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome() + " | Média: " + String.format("%.2f", a.calcularMedia()));
        }
    }
}
