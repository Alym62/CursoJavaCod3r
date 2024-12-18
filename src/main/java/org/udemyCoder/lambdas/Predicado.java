package org.udemyCoder.lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = (prod) -> (prod.getPreco() * (1 - prod.getDesconto())) >= 1000;
        System.out.println(isCaro.test(new Produto("Notebook", 3890.90, 0.15)));
    }
}
