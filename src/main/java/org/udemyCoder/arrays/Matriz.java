package org.udemyCoder.arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos alunos?");
        int quantidadeAlunos = scanner.nextInt();

        System.out.println("Quantas notas por aluno?");
        int quantidadeDeNotaPorAluno = scanner.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeDeNotaPorAluno];

        double total = 0.0;
        for (int notaDaTurma = 0; notaDaTurma < notasDaTurma.length; notaDaTurma++) {
            for (int nota = 0; nota < notasDaTurma[notaDaTurma].length; nota++) {
                System.out.printf("Informe a nota %d do aluno %d: ", nota + 1, notaDaTurma + 1);
                notasDaTurma[notaDaTurma][nota] = scanner.nextDouble();

                total += notasDaTurma[notaDaTurma][nota];
            }
        }

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        System.out.println("A média da turma é: " + total / (quantidadeAlunos * quantidadeDeNotaPorAluno));

        scanner.close();
    }
}
