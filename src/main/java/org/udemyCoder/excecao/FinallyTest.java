package org.udemyCoder.excecao;

import java.util.Scanner;

public class FinallyTest {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println(7 / scanner.nextInt());
        } catch (Exception exception) {
            System.out.println("Ops! Ocorreu um erro: " + exception.getMessage());
        }

        // OU

        final Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(7 / scanner.nextInt());
        } finally {
            scanner.close();
        }
    }
}
