package org.udemyCoder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> nomes = System.out::println;
        Stream<String> langs = Stream.of("Java", "Go", "Rust\n");
        langs.forEach(nomes);

        String[] outrasLangs = { "Python", "Ruby", "C++\n" };
        Stream.of(outrasLangs).forEach(nomes);

        Arrays.stream(outrasLangs).forEach(nomes);

        Arrays.stream(outrasLangs, 1, 2).forEach(nomes);

        List<String> maisLangs = List.of("PHP", "Kotlin", "Ts");
        maisLangs.stream().forEach(nomes);
        maisLangs.parallelStream().forEach(nomes);

        // @TODO: Stream de forma infinita
        // Stream.generate(() -> "a").forEach(nomes);

        // @TODO: Outra forma de criar uma potencial stream infinita
        // Stream.iterate(0, (n) -> n + 1).forEach(System.out::println);
    }
}
