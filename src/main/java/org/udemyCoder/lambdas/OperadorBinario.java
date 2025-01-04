package org.udemyCoder.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (x, y) -> (x + y) / 2;
        System.out.println(media.apply(9.8, 5.7));

        BiFunction<Double, Double, String> resultado = (x, y) -> ((x + y) / 2) >= 7 ? "Aprovado" : "Reprovado" ;
        System.out.println(resultado.apply(9.5, 4.3));

        Function<Double, String> conceito = (m) -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(9.2, 7.2));
    }
}
