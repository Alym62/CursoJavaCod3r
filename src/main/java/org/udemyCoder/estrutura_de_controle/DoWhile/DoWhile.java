package org.udemyCoder.estrutura_de_controle.DoWhile;

import java.util.Scanner;

import static java.lang.System.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(in);
        String condicaoTexto;

        do {
            out.println("Fala um anime que você gosta: 🫡 ou digite sair.");
            condicaoTexto = entrada.next();
        } while (!condicaoTexto.equalsIgnoreCase("Sair"));

        entrada.close();
    }
}
