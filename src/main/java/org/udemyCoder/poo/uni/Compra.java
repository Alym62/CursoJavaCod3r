package org.udemyCoder.poo.uni;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Compra {
    private String cliente;
    private ArrayList<Item> itens = new ArrayList<>();

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public double obterValorTotal() {
        return itens.stream().mapToDouble(item -> item.getQuantidade() * item.getPreco()).sum();
    }

    @Override
    public String toString() {
        return "Compra{" +
                "cliente='" + cliente + '\'' +
                ", itens=" + itens +
                '}';
    }
}
