package org.udemyCoder.estrutura_de_controle.While;

import java.util.Scanner;

import static java.lang.System.*;

public class While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(in);

        String entradaDoUsuario = "";

        while (!entradaDoUsuario.equalsIgnoreCase("Sair")) {
            out.println("Você diz:");
            entradaDoUsuario = entrada.next();
        }

        entrada.close();
    }
}
