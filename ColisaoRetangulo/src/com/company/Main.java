package com.company;

public class Main {

    public static void main(String[] args) {

        Retangulo ret1 = new Retangulo(10, 20, 20, 40);
        Retangulo ret2 = new Retangulo(15, 18, 20, 30);

        if (ret1.verificaColisao(ret2)) {
            System.out.println("Ao menos um ponto de Retângulo 2 está contido               em Retângulo 1");
        }

    }

}
