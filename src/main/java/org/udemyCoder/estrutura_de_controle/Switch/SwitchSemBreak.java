package org.udemyCoder.estrutura_de_controle.Switch;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Locale.ROOT;
import static java.util.Locale.setDefault;

public class SwitchSemBreak {
    public static void main(String[] args) {
        setDefault(ROOT);
        Scanner entrada = new Scanner(in);
        out.println("Qual a sua faixa? 🥋");
        String faixa = entrada.next();

        switch (faixa.toLowerCase(ROOT)) {
            case "preta":
                out.println("Sei o Bassai-Dai");
            case "marrom":
                out.println("Sei o Tekki Shodan");
            case "roxa":
                out.println("Sei o Heian Godan");
            case "verde":
                out.println("Sei o Heian Yodan");
            case "laranja":
                out.println("Sei o Heian Sandan");
            case "vermelha":
                out.println("Sei o Heian Nidan");
            case "amarela":
                out.println("Sei o Heian Shodan");
                break;
            default:
                out.println("Começando...");
        }

        entrada.close();
    }
}
