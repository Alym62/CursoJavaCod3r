package org.udemyCoder.poo.composicao.desafio;

import java.util.Arrays;

public class ClienteTest {
    public static void main(String[] args) {
        Item caneta = new Item(10);
        caneta.setProduto(new Produto(1.50, "Caneta"));
        Item caderno = new Item(5);
        caderno.setProduto(new Produto(12.90, "Caderno"));
        Item camisa = new Item(3);
        camisa.setProduto(new Produto(39.90, "Camisa"));
        Item sapato = new Item(1);
        sapato.setProduto(new Produto(150.00, "Sapato Nike"));

        Compra compra = new Compra();
        compra.getItems().add(caneta);
        compra.getItems().add(caderno);
        Compra compraRoupas = new Compra();
        compraRoupas.getItems().add(camisa);
        compraRoupas.getItems().add(sapato);
        Compra comprasVariadas = new Compra();
        comprasVariadas.getItems().add(caneta);
        comprasVariadas.getItems().add(camisa);

        Cliente cliente = new Cliente("Aly");
        cliente.getCompras().add(compra);
        cliente.getCompras().add(compraRoupas);
        cliente.getCompras().add(comprasVariadas);

        System.out.println("O valor total da compra do cliente: " + cliente.getNome() + " " + "foi de R$" + cliente.obterValorTotalCompra());
    }
}
