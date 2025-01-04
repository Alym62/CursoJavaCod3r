package org.udemyCoder.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // TODO: Não ordenado.
        Set<String> nomes = new HashSet<>();
        nomes.add("Aly");
        nomes.add("Thai");
        nomes.add("Leiloca");

        for (String nome : nomes) {
            System.out.println("Meu nome é: " + nome);
        }

        System.out.println("-----------------");

        // TODO: Ordenado.
        Set<String> nomesOrdenados = new TreeSet<>();
        nomesOrdenados.add("Aly");
        nomesOrdenados.add("Thai");
        nomesOrdenados.add("Leiloca");

        for (String nome : nomesOrdenados) {
            System.out.println("Meu nome é: " + nome);
        }
    }
}
