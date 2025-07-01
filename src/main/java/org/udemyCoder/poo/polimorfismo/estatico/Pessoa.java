package org.udemyCoder.poo.polimorfismo.estatico;

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

    public void comer(final Arroz arroz) {
        this.peso += arroz.getPeso();
    }

    public void comer(final Feijao feijao) {
        this.peso += feijao.getPeso();
    }

    public void comer(final Sorvete sorvete) {
        this.peso += sorvete.getPeso();
    }

    public void comerTodosAlimentos(Object... alimentos) {
        for (Object alimento : alimentos) {
            double pesoAlimento;

            if (alimento instanceof Arroz) {
                pesoAlimento = ((Arroz) alimento).getPeso();
            } else if (alimento instanceof Feijao) {
                pesoAlimento = ((Feijao) alimento).getPeso();
            } else if (alimento instanceof Sorvete) {
                pesoAlimento = ((Sorvete) alimento).getPeso();
            } else {
                throw new IllegalArgumentException("Ops! Alimento passado não bate na tabela nutricional");
            }

            this.peso += pesoAlimento;
        }
    }
}
