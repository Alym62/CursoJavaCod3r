package org.udemyCoder.console;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom dia 😭");
        System.out.print("Aly\n");
        System.out.print("Meireles\n");
        System.out.printf("Idade: %d%n", 20);
        System.out.printf("Salário: %.1f%n", 1364.59);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = sc.next();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = sc.next();

        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();

        System.out.println("Qual a sua profissão?");
        String profissao = sc.next();

        System.out.println("Qual o seu salário?");
        double salario = sc.nextDouble();

        StringBuilder sb = new StringBuilder();
        var resultado = sb.append(String.format(
                "Meu nome: %s%n" +
                "Sobrenome: %s%n" +
                "Idade: %s%n" +
                "Profissão: %s%n" +
                "Salário: R$ %s%n",
                nome.toUpperCase(), sobrenome.toUpperCase(), idade, profissao, salario
        ));

        System.out.println(resultado);

        sc.close();
    }
}
