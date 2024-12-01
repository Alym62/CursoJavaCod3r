package org.udemyCoder.poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public double obterValorTotalItems() {
        return getItems().stream().mapToDouble(item -> item.getQuantidade() * item.getProduto().getPreco()).sum();
    }
}
