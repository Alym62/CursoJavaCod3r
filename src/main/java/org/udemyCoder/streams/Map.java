package org.udemyCoder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        List<String> marcas = Arrays.asList("BMW", "Audi", "Ford");

        marcas.stream().map(String::toUpperCase)
                .forEach(print);

        System.out.println(Utilitarios.maiuscula.andThen(Utilitarios.primeiraLetra
                .andThen(Utilitarios.grito)).apply("BMW"));

        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.grito)
                .forEach(print);
    }
}
