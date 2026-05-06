package org.udemyCoder.generics;

public class CaixaTest {
    public static void main(String[] args) {
        final Caixa caixa = new Caixa();
        final String texto = "olá";
        caixa.guardar(texto);

        final Integer coisa = (Integer) caixa.abrir();
        System.out.println(coisa);
    }
}
