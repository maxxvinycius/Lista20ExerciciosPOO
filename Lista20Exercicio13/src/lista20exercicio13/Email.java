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
public class Email extends Notificacao{
    public Email(String destinatario, String mensagem, String data){
        super(destinatario, mensagem, data);
    }
    @Override
    public void enviar(){
        System.out.println("enviou um email");
    }
}
