package org.udemyCoder.estrutura_de_controle.If;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class If {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner entrada = new Scanner(in);

        out.println("Informe a média:");
        double nota = entrada.nextDouble();

        var aprovado = nota >= 7.0 && nota <= 10;
        var recuperacao = nota < 7.0 && nota >= 5;
        var reprovado = nota < 5;

        if (aprovado)
            out.println("Você está aprovado! 🥳");
        else if (recuperacao)
            out.println("Você está de recuperação! 🤔");
        else if (reprovado)
            out.println("Você está reprovado! 😭");
        else
            out.println("Não é possível fazer o processo dessa nota. Entre em contato com o suporte.");

        entrada.close();
    }
}
