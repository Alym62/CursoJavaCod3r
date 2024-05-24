package org.udemyCoder.classe_metodos.desafio.modulo;

import java.util.Objects;

public class Pessoa {
    private String name;
    private double weight;

    public Pessoa() {}

    public Pessoa(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static String weightFormated(String name, double weight) {
        return String.format("Peso atual de %s: %s Kg", name, weight);
    }

    public void comer(Comida comida) {
            System.out.printf("%s está comendo %s%n", Objects.nonNull(getName()) ? getName() : "Sem nome",
                    Objects.nonNull(comida.getNameFood()) ? comida.getNameFood() : "Alimento sem nome");

            var pesoAtualDaPessoa = getWeight() + comida.getFoodWeight();

            System.out.println(weightFormated(getName(), pesoAtualDaPessoa));
    }
}
