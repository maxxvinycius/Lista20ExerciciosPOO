package lista20exercicios5;

public class Coordenador extends Pessoa {
    private String setor;

    public Coordenador(String nome, String cpf, int idade, String setor) {
        super(nome, cpf, idade);
        this.setor = setor;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o coordenador do setor " + setor + " e meu nome é " + getNome());
    }

    @Override
    public double calcularMedia() {
        // Coordenador não tem média → retorna 0
        return 0;
    }

    public String getSetor() { return setor; }
}
