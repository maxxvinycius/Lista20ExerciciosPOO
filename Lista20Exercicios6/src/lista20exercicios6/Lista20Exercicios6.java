/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios6;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author aluno.saolucas
 */
public class Lista20Exercicios6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== Menu da Loja ===");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Realizar venda");
            System.out.println("4. Listar produtos");
            System.out.println("5. Exibir vendas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Tipo: 1-Eletrônico, 2-Roupa, 3-Alimento");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    Produto produto = null;
                    switch (tipo) {
                        case 1: produto = new Eletronico(nomeProduto, preco); break;
                        case 2: produto = new Roupa(nomeProduto, preco); break;
                        case 3: produto = new Alimento(nomeProduto, preco); break;
                        default: System.out.println("Tipo inválido!"); continue;
                    }
                    produtos.add(produto);
                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    clientes.add(new Cliente(nomeCliente));
                    System.out.println("Cliente cadastrado!");
                    break;

                case 3:
                    if (clientes.isEmpty() || produtos.isEmpty()) {
                        System.out.println("É necessário ter clientes e produtos cadastrados.");
                        break;
                    }
                    System.out.println("Selecione o cliente:");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println((i + 1) + ". " + clientes.get(i).getNome());
                    }
                    int idxCliente = sc.nextInt() - 1;

                    System.out.println("Selecione o produto:");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println((i + 1) + ". " + produtos.get(i));
                    }
                    int idxProduto = sc.nextInt() - 1;

                    vendas.add(new Venda(clientes.get(idxCliente), produtos.get(idxProduto)));
                    System.out.println("Venda realizada!");
                    break;

                case 4:
                    System.out.println("=== Produtos ===");
                    for (Produto p : produtos) {
                        System.out.println(p);
                    }
                    break;

                case 5:
                    System.out.println("=== Vendas ===");
                    for (Venda v : vendas) {
                        System.out.println(v);
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
    
    

