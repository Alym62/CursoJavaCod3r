package org.udemyCoder.excecao;

import org.udemyCoder.streams.Aluno;

public class Basico {
    public static void main(String[] args) {
        Aluno aluno = null;

        divisao();
        imprimirNomeDoAluno(aluno, false);
    }

    private static void divisao() {
        try {
            int a = 7;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            System.out.println("Ops! Ocorreu um erro ao tentar fazer a divisão dos valores.");
        } finally {
            System.out.println("Calculo realizado com sucesso!");
        }
    }

    private static void validarNome(Aluno aluno) {
        try {
            System.out.println(aluno.getNome());
        } catch (NullPointerException exception) {
            System.out.println("Ops! O nome do aluno está vazio.");
        }
    }

    private static void imprimirNomeDoAluno(Aluno aluno, boolean naoUsarTry) {
        if (naoUsarTry) {
            validarNomeEImprimir(aluno);
        } else {
           validarNome(aluno);
        }
    }

    private static void validarNomeEImprimir(Aluno aluno) {
        if (aluno == null || aluno.getNome() == null) {
            System.out.println("Ops! O nome do aluno está vazio.");
        } else {
            System.out.println(aluno.getNome());
        }
    }
}
