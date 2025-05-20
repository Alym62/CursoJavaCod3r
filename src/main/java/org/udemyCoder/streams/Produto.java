package org.udemyCoder.streams;

public record Produto(String nome, double preco, double desconto, double frete) {

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                ", frete=" + frete +
                '}';
    }
}
