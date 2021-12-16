/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author augus
 */
public class Retangulo {
    
    Retangulo() { // Construtor
        
    }
    
    private int a;
    private int b;
    
    public void setA(int a) {
        this.a = a;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public void verificaRet() {
        if (a != b) {
            System.out.println(this.calculaAreaRet());
        } else {
            System.out.println("Você não tem um retângulo!");
        }
    }
    
    public double calculaAreaRet() {
        if (a < 0 || b < 0) {
            return 0;
        }
        return a * b;
    }
    
}
