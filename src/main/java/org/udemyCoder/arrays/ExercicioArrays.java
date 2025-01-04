package org.udemyCoder.arrays;

import java.util.Arrays;

public class ExercicioArrays {
    public static void main(String[] args) {
        double[] notasAlunoAly = new double[3];
        notasAlunoAly[0] = 7.9;
        notasAlunoAly[1] = 6.4;
        notasAlunoAly[2] = 9.7;

        String format = Arrays.toString(notasAlunoAly);
        System.out.println(format);

        double totalAly = 0.0;
        for (double nota : notasAlunoAly) {
            totalAly += nota;
        }

        System.out.println(totalAly / notasAlunoAly.length);

        double[] notasAlunaLeiloca = {10, 9.8, 8.5};

        double totalLeiloca = 0.0;
        for (double nota : notasAlunaLeiloca) {
            totalLeiloca += nota;
        }

        System.out.println(totalLeiloca / notasAlunaLeiloca.length);
    }
}
