package org.udemyCoder.operadores.atribuicao;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        System.out.println(c += b);
        System.out.println(c -= b);
        System.out.println(c *= b);
        System.out.println(c /= b);
        System.out.println(c %= b);
    }
}
