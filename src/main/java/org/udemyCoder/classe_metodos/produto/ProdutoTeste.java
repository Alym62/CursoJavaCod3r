package org.udemyCoder.classe_metodos.produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto;
        Produto produtoConstrutor;
        produto = new Produto();
        produtoConstrutor = new Produto("Iphone 14", 7.500, 350);
        produto.setNome("Carregador de iphone");
        produto.setPreco(200);
        produto.setDesconto(120);

        double precoFinalCarregador = produto.precoComDesconto(20);
        double precoFinalIphone = produtoConstrutor.precoComDesconto(10);

        System.out.println("Preço final do produto: R$" + precoFinalCarregador);
        System.out.println("Preço final do produto: R$" + precoFinalIphone);
    }
}
