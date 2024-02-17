package org.udemyCoder.tipo_string;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");
        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);

        // TODO: O trim serve para tirar todos os espaços em branco.
        String stringSemEspaco = entrada.next();
        System.out.println("2".equals(stringSemEspaco.trim()));

        entrada.close();
    }
}
