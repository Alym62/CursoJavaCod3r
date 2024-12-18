package org.udemyCoder.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> nomes = (prod) -> System.out.println(prod.getNome());
        nomes.accept(new Produto("MacBook", 7000, 0.10));

        List<Produto> listProdutos = List.of(new Produto("Notebook", 4200.30, 0.10), new Produto("Iphone", 7000, 0.10));
        listProdutos.forEach(produto -> {
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
        });
    }
}
