package org.udemyCoder.classe_metodos.produto;

public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    public Produto() {}

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return String.format("Produto=[Nome: %s, Preço: %s, Desconto: %s]", nome, preco, desconto);
    }

    public double precoComDesconto() {
        return preco * (1 - desconto);
    }

    public double precoComDesconto(double descontoDoGerente) {
        return desconto + descontoDoGerente / 100 * preco;
    }
}
