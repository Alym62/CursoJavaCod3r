package org.udemyCoder.streams;

public class Media {
    private double total;
    private int quantidade;

    public Media add(double valor) {
        total += valor;
        quantidade++;

        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static Media combinar(Media primeiraMedia, Media segundaMedia) {
        Media resultante = new Media();
        resultante.total = primeiraMedia.total + segundaMedia.total;
        resultante.quantidade = primeiraMedia.quantidade + segundaMedia.quantidade;

        return resultante;
    }
}
