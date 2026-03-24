/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicios8;
import java.util.ArrayList;
/**
 *
 * @author aluno.saolucas
 */
public class Lista20Exercicios8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito(150.0, "24/03/2026", "Compra online", "1234567890123456"));
        pagamentos.add(new Pix(200.0, "24/03/2026", "Pagamento de serviço", "meuemail@dominio.com"));
        pagamentos.add(new Boleto(500.0, "24/03/2026", "Pagamento fatura", "23793381234567890123450000000000000000000000"));
        pagamentos.add(new Dinheiro(50.0, "24/03/2026", "Pagamento presencial"));

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
            System.out.println("---------------------------");
        }
    }
    }
    

