/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista20exercicio14;

/**
 *
 * @author maxvi
 */
public class Lista20Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Filme f = new Filme("jurassic park", "01:50:09", "mark");
       AudioLivro al = new AudioLivro("macacos voadores", "03:03:29", "fabricio");
       Musica m = new Musica("JAPONES", "00:03:24", "brandao");
       Podcast p = new Podcast("neymar", "02:30:00", "mitico");
       
       f.reproduzir();
        System.out.println("titulo:"+ f.getTitulo());
        System.out.println("duracao:"+ f.getDuracao());
        System.out.println("autor:"+ f.getAutor());
        System.out.println("");
        
        al.reproduzir();
        System.out.println("titulo:"+ al.getTitulo());
        System.out.println("duracao:"+ al.getDuracao());
        System.out.println("autor:"+ al.getAutor());
        System.out.println("");
        
        m.reproduzir();
        System.out.println("titulo:"+ m.getTitulo());
        System.out.println("duracao:"+ m.getDuracao());
        System.out.println("autor:"+ m.getAutor());
        System.out.println("");
        
        p.reproduzir();
        System.out.println("titulo:"+ p.getTitulo());
        System.out.println("duracao:"+ p.getDuracao());
        System.out.println("autor:"+ p.getAutor());
    }
    
}
