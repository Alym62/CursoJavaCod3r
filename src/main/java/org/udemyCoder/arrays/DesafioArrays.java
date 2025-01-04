package org.udemyCoder.arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantas notas você deseja calcular?");
        double[] notas = new double[scanner.nextInt()];

        double total = 0.0;
        double count = 0.0;
        for (double nota : notas) {
            count += nota;
            System.out.printf("Valor nota N° %s:%n", count++);
            total += scanner.nextDouble();
        }

        System.out.println("A média final do aluno é: " + (total / 3));

        scanner.close();
    }
}
