package org.udemyCoder.desafio_modulo;

import java.util.Scanner;

import static java.lang.String.format;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // TODO: Ler 2 numeros e a operação que o usuário quer fazer seja ela: + - * / %.
        Scanner entrada = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Insira os valores que deseja calcular: Obs. Só numeros são aceitos");
        System.out.println("Primeiro valor:");
        double numA = entrada.nextDouble();
        System.out.println("Segundo valor:");
        double numB = entrada.nextDouble();

        System.out.println("Agora insira a operação que deseja fazer: Obs. Só símbolos são aceitos");
        System.out.println("Operação:");
        String operacao = entrada.next();
        var multiplicacao = "*";
        var atribuicao = "+";
        var subtracao = "-";
        var divisao = "/";
        var modulo = "%";

        var resultadoOperacoes = operacao.equals(multiplicacao) ?
                numA * numB : operacao.equals(atribuicao) ? numA + numB : operacao.equals(subtracao) ? numA - numB :
                operacao.equals(divisao) ? numA / numB : operacao.equals(modulo) ? numA % numB : "Não existe essa operação";

        System.out.println(sb.append(format("Operação: %s %s %s = %s", numA, operacao, numB, resultadoOperacoes)));

        entrada.close();
    }
}
