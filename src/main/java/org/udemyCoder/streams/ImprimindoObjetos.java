package org.udemyCoder.streams;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> nomes = List.of("Aly", "Thai", "Leiloca");

        // @TODO: For tradicional
        System.out.println("\nFor tradicional >>>");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // @TODO: For enhanced
        System.out.println("\nFor enhanced >>>");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // @TODO: Iterator com while
        System.out.println("\nIterator com while >>>");
        Iterator<String> itNomes = nomes.iterator();
        while (itNomes.hasNext()) {
            System.out.println(itNomes.next());
        }

        // @TODO: Stream API
        System.out.println("\nStream API >>>");
        Stream<String> streamNomes = nomes.stream();
        streamNomes.forEach(System.out::println);
    }
}
