package lista20exercicios5;

import java.util.ArrayList;
import java.util.List;

public class Lista20Exercicios5 {
    public static void main(String[] args) {

        // Criando alunos
        Aluno aluno1 = new Aluno("João", "123.456.789-00", 16, 8.5, 7.0, 9.0);
        Aluno aluno2 = new Aluno("Maria", "987.654.321-00", 17, 9.0, 8.5, 7.5);
        Aluno aluno3 = new Aluno("Lucas", "456.123.789-00", 16, 6.5, 7.0, 8.0);

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        // Criando professor
        Professor professor = new Professor("Carlos", "111.222.333-44", 35, "Matemática");

        // Criando coordenador
        Coordenador coordenador = new Coordenador("Ana", "555.666.777-88", 40, "Ciências");

        // Criando turma
        Turma turma = new Turma("1º Ano A", professor, coordenador, listaAlunos);

        // Apresentando a turma
        System.out.println("=== Apresentação da Turma ===");
        turma.apresentarTurma();

        // Apresentações individuais
        System.out.println("\n=== Apresentações individuais ===");
        aluno1.apresentar();
        professor.apresentar();
        coordenador.apresentar();

        // Média de um aluno específico
        System.out.println("\nMédia do aluno " + aluno1.getNome() + ": " + String.format("%.2f", aluno1.calcularMedia()));
    }
}