package org.udemyCoder.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = (n) -> n + 2;
        UnaryOperator<Integer> multiDois = (n) -> n * 2;
        UnaryOperator<Integer> aoQuadrado = (n) -> n * n;

        var result = maisDois
                .andThen(multiDois)
                .andThen(aoQuadrado).apply(0);
        System.out.println(result);

        var result2 = aoQuadrado
                .compose(multiDois)
                .compose(maisDois).apply(0);
        System.out.println(result2);
    }
}
