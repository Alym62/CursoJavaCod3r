package org.udemyCoder.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        /*
         * Desafio para filtrar produtos em promocão, frete gratis e produto relevante
         * */

        Produto iphone = new Produto("Iphone 14", 3250, 35, 30);
        Produto mac = new Produto("Macbook", 7250, 0.12, 30);

        List<Produto> produtos = new ArrayList<>(List.of(iphone, mac));

        // Com interfaces funcionais e Stream API do Java
        Predicate<Produto> superPromo = p -> p.desconto() >= 30;
        Predicate<Produto> freteGratis = p -> p.frete() == 30;
        Predicate<Produto> produtoRelevante = p -> p.preco() >= 500;

        Function<Produto, String> chamadaPromocional = p -> "Parabéns! 🎉 " + p.nome() + " está de promoção por R$ " + p.preco();

        produtos.stream()
                .filter(superPromo)
                .filter(freteGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

        // Com Stream API do Java
        produtos.stream()
                .filter(p -> p.desconto() >= 30)
                .filter(p -> p.frete() == 30)
                .filter(p -> p.preco() >= 500)
                .map(Produto::nome)
                .forEach(System.out::println);
    }
}
