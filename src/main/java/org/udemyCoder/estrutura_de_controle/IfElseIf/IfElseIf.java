package org.udemyCoder.estrutura_de_controle.IfElseIf;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class IfElseIf {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner entrada = new Scanner(in);

        out.println("Digite uma nota de 0 a 10:");
        double nota = entrada.nextDouble();

        if (nota > 10  || nota < 0)
            out.println("Nota inválida");
        else if (nota >= 8.1)
            out.println("Conceito A");
        else if (nota >= 6.1 && nota < 8)
            out.println("Conceito B");
        else if (nota >= 4.1 && nota < 6)
            out.println("Conceito C");
        else
            out.println("Conceito D");

        out.println("Fim do programa!");
        entrada.close();
    }
}
