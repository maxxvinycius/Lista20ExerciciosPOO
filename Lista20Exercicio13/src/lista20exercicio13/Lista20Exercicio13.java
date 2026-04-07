/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio13;

/**
 *
 * @author maxvi
 */
public class Lista20Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Email e = new Email("joao@email.com", "Olá joao, aqui é da vivo", "23/04/26");
        Push p = new Push("USD756SD", "olá", "14/08/26");
        SMS s = new SMS("51999999999", "sua recarga da claro esta pronta!", "22/09/25");
        WhatSapp w = new WhatSapp("51988888888", "seu código é: 556632", "1/05/24");
        
        e.enviar();
        System.out.println("destinatario: " + e.getDestinatario());
        System.out.println("mensagem: " + e.getMensagem());
        System.out.println("data: " + e.getData());
        System.out.println("");
        
        p.enviar();
        System.out.println("destinatario: " + p.getDestinatario());
        System.out.println("mensagem: " + p.getMensagem());
        System.out.println("data: " + p.getData());
        System.out.println("");

s.enviar();
        System.out.println("destinatario: " + s.getDestinatario());
        System.out.println("mensagem: " + s.getMensagem());
        System.out.println("data: " + s.getData());
        System.out.println("");
        
        w.enviar();
        System.out.println("destinatario: " + w.getDestinatario());
        System.out.println("mensagem: " + w.getMensagem());
        System.out.println("data: " + w.getData());
        
        
    }
    
}
