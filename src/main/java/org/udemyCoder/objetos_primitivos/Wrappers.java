package org.udemyCoder.objetos_primitivos;

import static java.lang.Boolean.*;

public class Wrappers {
    public static void main(String[] args) {
        // TODO: Wrapper é uma versão objeto dos tipos primitivos.
        String s = "text";
        System.out.println(s);

        Byte b = 100;
        System.out.println(b.byteValue());

        Short sh = 1000;
        System.out.println(sh);

        Integer i = Integer.parseInt("10000");
        System.out.println(i * 3);

        Long l = 100000L;
        System.out.println(l / 3);

        Float f = 23.10F;
        System.out.println(f);

        Double d = 190.99;
        System.out.println(d);

        Boolean bo = TRUE;
        System.out.println(bo);

        Character ch = '#';
        System.out.println(ch);
    }
}
