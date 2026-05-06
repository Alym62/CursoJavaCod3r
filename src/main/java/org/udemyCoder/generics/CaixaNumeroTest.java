package org.udemyCoder.generics;

public class CaixaNumeroTest {
    public static void main(String[] args) {
        final CaixaNumero<Double> caixaNumero = new CaixaNumero<>();
        caixaNumero.guardar(3.1415);

        final CaixaNumero<Integer> integerCaixaNumero = new CaixaNumero<>();
        integerCaixaNumero.guardar(1);

        System.out.println(caixaNumero.abrir());
        System.out.println(integerCaixaNumero.abrir());
    }
}
