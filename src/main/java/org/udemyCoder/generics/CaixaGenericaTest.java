package org.udemyCoder.generics;

public class CaixaGenericaTest {
    public static void main(String[] args) {
        final CaixaGenerica<String> caixa = new CaixaGenerica<>();
        final String papel = "Olá";

        caixa.guardar(papel);
        final String coisa = caixa.abrir();

        System.out.println(coisa);

        final CaixaGenerica<Double> caixaMatematica = new CaixaGenerica<>();
        caixaMatematica.guardar(3.1415);

        System.out.println(caixaMatematica.abrir());
    }
}
