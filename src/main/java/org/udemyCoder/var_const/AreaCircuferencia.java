package org.udemyCoder.var_const;

import java.util.Scanner;

public class AreaCircuferencia {
    public static void main(String[] args) {
        // @TODO: Para calculos é sempre bom colocar um valor double para a maquina virtual fazer o calculo correto.
        Scanner sc = new Scanner(System.in);

        final double TEMPERATURA_C = 32.0;
        final double DIVISION = 5.0 / 9.0;

        System.out.println("Qual é a temperatura em °F: ");
        double tempF = sc.nextDouble();
        double result = (tempF - TEMPERATURA_C) * DIVISION;

        System.out.println("Resultado da conversão da temperatura em °C: " + result);

        sc.close();
    }
}
