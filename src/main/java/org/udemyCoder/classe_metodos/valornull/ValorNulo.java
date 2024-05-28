package org.udemyCoder.classe_metodos.valornull;

import java.util.Objects;

public class ValorNulo {
    static String string;

    public static void main(String[] args) {
        String s = "";
        System.out.println(s.concat("!!!"));

        if (!Objects.nonNull(string)) {
            string = "Eu";
            System.out.println(string.concat("!!!"));
        } else {
            System.out.println("A variavel [string] não está nula.");
        }
    }
}
