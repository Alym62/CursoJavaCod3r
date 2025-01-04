package org.udemyCoder.poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public double obterValorTotalCompra() {
        return compras.stream().mapToDouble(Compra::obterValorTotalItems).sum();
    }
}
