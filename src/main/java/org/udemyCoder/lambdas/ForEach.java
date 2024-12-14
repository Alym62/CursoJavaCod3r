package org.udemyCoder.lambdas;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> alunos = List.of("Joca", "Ana", "Thai");

        System.out.println("For >>>> ");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Lambda >>>> ");
        alunos.forEach(aluno -> System.out.println(aluno));

        System.out.println("Method reference >>>> ");
        alunos.forEach(System.out::println);

        System.out.println("Lambda #02 >>>> ");
        alunos.forEach(aluno -> imprimir(aluno));

        System.out.println("Method reference #02 >>>> ");
        alunos.forEach(ForEach::imprimir);
    }

    private static void imprimir(String nome) {
        System.out.println("Oi meu nome é: " + nome);
    }
}
