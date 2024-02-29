package org.udemyCoder.classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto;
        produto = new Produto();
        produto.setNome("Carregador de iphone");
        produto.setPreco(200.0);
        produto.setDesconto(120.0);

        System.out.println(produto);
    }
}
