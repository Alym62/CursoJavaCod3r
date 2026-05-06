package org.udemyCoder.generics;

public class CaixaIntTest {
    public static void main(String[] args) {
        final CaixaInt caixaInt = new CaixaInt();
        caixaInt.guardar(1);

        System.out.println(caixaInt.abrir());
    }
}
