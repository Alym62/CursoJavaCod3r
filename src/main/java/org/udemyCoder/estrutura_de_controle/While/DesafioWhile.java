package org.udemyCoder.estrutura_de_controle.While;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class DesafioWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner entrada = new Scanner(in);

        int quantidadeDeNotas = 0;
        double nota = 0.0;
        double condicao = -1.0;
        double total = 0.0;

        while (nota != condicao && quantidadeDeNotas != 4) {
            out.println("Digite a nota:");
            nota = entrada.nextDouble();
            validarNumeroMaiorQueDez(nota);
            total += nota;
            quantidadeDeNotas++;
        }


        var mediaFinal = calcularMediaDoAluno(total, quantidadeDeNotas);
        validarQuantidadeDeNotasDigitadas(quantidadeDeNotas);
        validarSituacaoDoAluno(mediaFinal);

        entrada.close();
    }

    private static void validarNumeroMaiorQueDez(double numero) {
        if (numero > 10)
            out.println("Número inválio. Digite um número de 0 a 10 ou se deseja sair digite -1");
        else if (numero < 0)
            out.println("O número não pode ser negativo. A não ser que você queira sair do sistema, digite -1");
    }

    private static double calcularMediaDoAluno(double nota, int qtdDeNotas) {
        var notaFinal = 0.0;
        if (qtdDeNotas == 4)
            notaFinal = nota / qtdDeNotas;

        return notaFinal;
    }

    private static void validarSituacaoDoAluno(double media) {
        if (media <= 10 && media >= 7)
            out.println("Aprovado! 🥳 - Média: " + media);
        else if (media < 7 && media >= 5)
            out.println("Recuperação! 🤔 - Média: " + media);
        else if (media < 5 && media >= 0)
            out.println("Reprovado! 😭 - Média: " + media);
    }

    private static void validarQuantidadeDeNotasDigitadas(int qtdNotasDigitadas) {
        if (qtdNotasDigitadas < 4)
            out.println("Não foi possível terminar todo o processo de calcular a média do aluno. É preciso digitar 4 notas.");
    }
}
