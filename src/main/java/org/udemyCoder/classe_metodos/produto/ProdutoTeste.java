package org.udemyCoder.classe_metodos.produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto;
        produto = new Produto();
        produto.setNome("Carregador de iphone");
        produto.setPreco(200);
        produto.setDesconto(120);

        double precoFinal = produto.precoComDesconto(20);

        System.out.println("Preço final do produto: R$" + precoFinal);
    }
}
