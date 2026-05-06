package org.udemyCoder.generics;

public class ParesTest {
    public static void main(String[] args) {
        final Pares pares = new Pares();
        pares.adicionarValor(1, false);
        pares.adicionarValor(2, true);
        pares.adicionarValor(2, true);
        pares.adicionarValor(null, true);

        System.out.println(pares);
        System.out.println(pares.getValor(2));
        System.out.println(pares.getValor(null));
    }
}
