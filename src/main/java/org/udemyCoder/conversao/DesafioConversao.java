package org.udemyCoder.conversao;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual foi o seu salário no mês de janeiro?");
        String salarioJan = entrada.next().replace(",", ".");

        System.out.println("Qual foi o seu salário no mês de fevereiro?");
        String salarioFev = entrada.next().replace(",", ".");

        System.out.println("Qual foi o seu salário no mês de março?");
        String salarioMarc = entrada.next().replace(",", ".");

        double salarioJanDouble = parseDouble(salarioJan);
        double salarioFevDouble = parseDouble(salarioFev);
        double salarioMarcDouble = parseDouble(salarioMarc);

        double resultado = (salarioJanDouble + salarioFevDouble + salarioMarcDouble) / 3;

        System.out.println(resultado);

        entrada.close();
    }
}
