package org.udemyCoder.operadores.ternario;

public class Ternario {
    public static void main(String[] args) {
        double media = 4.5;
        String resultadoRecuperacao = media >= 5.0 ? "Em recuperação".concat("🙄") : "Reprovado".concat("😭");
        String resultado = media >= 7 ? "Aprovado".concat("🥳") : resultadoRecuperacao;

        System.out.println("O aluno está: " + resultado);
    }
}
