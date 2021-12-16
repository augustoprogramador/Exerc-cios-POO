/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_ex_jogo_trivia;

//import java.util.Scanner;

/**
 *
 * @author augus
 */
public class DesafioFrutras {
    
    String[] pergsSobreFrutas = new String[10];
    String[] resposta = new String[10];
//    boolean[] corretas = new boolean[3];
    boolean[] corretas = {false, false, false};
    
    public DesafioFrutras() {
        
        this.pergsSobreFrutas[0] = "Fruta verde que é madura e mole";
        this.resposta[0] = "abacate";
        
        this.pergsSobreFrutas[1] = "Fruta vermelha que acordou Newton";
        this.resposta[1] = "maçã";
        
        this.pergsSobreFrutas[2] = "Fruta verde que é madura e mole";
        this.resposta[2] = "abacate";
        
        System.out.println(pergsSobreFrutas[1]);
        
//        for (int i = 0; i < 3; i++) { // inicializa a variável
//            corretas[i] = false;
//        }
        
    }
    
    public void executarJogo() {
        int pergunta;
        pergunta = (int)(Math.random() * 3);
        
        System.out.println("Valor da escolha: " + pergunta);
        
        System.out.println(pergsSobreFrutas[pergunta]);

        
        /*Scanner leitor = new Scanner(System.in);
        String resp;
        resp = leitor.next();
        System.out.println("Você digitou: " + resp);*/
        
    }
    
}
