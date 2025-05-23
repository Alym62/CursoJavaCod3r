package org.udemyCoder.poo.polimorfismo.dinamico;

public class Pessoa {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0)
            throw new IllegalArgumentException("Ops! O peso não pode ser menor que zero.");

        this.peso = peso;
    }

    public void comer(final Alimento alimento) {
        this.peso += alimento.getPeso();
    }

    public void comerTodosAlimentos(Alimento... alimentos) {
        for (Alimento alimento : alimentos) {
            if (alimento == null) throw new IllegalArgumentException("Ops! Alimento não encontrado na tabela nutricional.");

            this.peso += alimento.getPeso();
        }
    }
}
