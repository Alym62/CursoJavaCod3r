package org.udemyCoder.estrutura_de_controle.Switch;

import java.util.Scanner;

import static java.lang.System.*;
import static java.util.Locale.*;

public class SwitchComBreak {
    public static void main(String[] args) {
        setDefault(ROOT);
        Scanner entrada = new Scanner(in);
        String conceito = "";
        int nota = entrada.nextInt();

        // TODO: Switch aprimorado.
        conceito = switch (nota) {
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            case 4, 3 -> "D";
            case 2, 1 -> "E";
            default -> "Não informado. Digite um número de 1 a 9.";
        };

        out.println("Conceito é - " + conceito);
        entrada.close();
    }
}
