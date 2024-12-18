package org.udemyCoder.lambdas;

import java.util.List;
import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = (value) -> value % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(11));

        Function<String, String> resultado = (value) -> "O resultado é: " + value;
        String resultadoFinal = parOuImpar.andThen(resultado).apply(10);
        System.out.println(resultadoFinal);

        List<Produto> list = List.of(new Produto("GalaxyS23", 3.800, 0.10));
        List<String> nomesProdutos = list.stream()
                .map(Produto::getNome).toList();

        nomesProdutos.forEach(System.out::println);
    }
}
