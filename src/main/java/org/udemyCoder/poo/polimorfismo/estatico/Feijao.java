package org.udemyCoder.poo.polimorfismo.estatico;

public class Feijao {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0)
            throw new IllegalArgumentException("Ops! O peso não pode ser menor que zero.");

        this.peso = peso;
    }
}
