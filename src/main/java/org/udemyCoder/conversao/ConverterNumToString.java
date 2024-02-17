package org.udemyCoder.conversao;

public class ConverterNumToString {
    public static void main(String[] args) {
        // TODO: Isso vale para todos os tipos.
        Integer num = 10;
        System.out.println(num.toString().concat("♾️"));

        int numPrimitivo = 100;
        System.out.println(Integer.toString(numPrimitivo).concat("😭"));
    }
}
