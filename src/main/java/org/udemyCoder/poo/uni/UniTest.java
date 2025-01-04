package org.udemyCoder.poo.uni;

public class UniTest {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.setCliente("Aly");
        compra.getItens().add(new Item("Caneta", 10, 2.50));
        compra.getItens().add(new Item("Caderno", 5, 12.90));

        System.out.println(compra.getItens());
        System.out.println(compra.obterValorTotal());
    }
}
