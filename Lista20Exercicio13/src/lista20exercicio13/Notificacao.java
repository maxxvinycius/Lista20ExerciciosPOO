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
public class Notificacao {
    private String destinatario;
    private String mensagem;
private String data;

public Notificacao(String destinatario, String mensagem, String data){
    this.destinatario = destinatario;
    this.mensagem = mensagem;
    this.data = data;
    
    
}
public String getDestinatario(){
    return destinatario;
    
}
public String getMensagem(){
    return mensagem;
}
public String getData(){
    return data;
}
public void enviar(){
    System.out.println("enviando mensagem");
}
} 