package org.udemyCoder.poo.polimorfismo.dinamico;

public class Arroz implements Alimento {
    private double peso;

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0)
            throw new IllegalArgumentException("Ops! O peso não pode ser menor que zero.");

        this.peso = peso;
    }
}
