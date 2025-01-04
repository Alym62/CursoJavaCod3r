package org.udemyCoder.lambdas;

import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> list = () -> List.of("Thai", "Aly", "");
        var listFiltrada = list.get().stream().filter(String::isBlank).toList();
        System.out.println(listFiltrada.size());
    }
}
