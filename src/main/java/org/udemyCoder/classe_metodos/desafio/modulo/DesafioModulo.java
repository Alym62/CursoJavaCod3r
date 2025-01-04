package org.udemyCoder.classe_metodos.desafio.modulo;

public class DesafioModulo {
    public static void main(String[] args) {
        Comida churrasco = new Comida("Churrasco de fraldinha", 1.2);
        Comida pudim = new Comida("Pudim de leite ninho", 0.327);
        Pessoa aly = new Pessoa("Alyasaf", 70);
        Pessoa leiloca = new Pessoa("Leila", 74);

        System.out.println("---------------FOOD---------------");
        System.out.println(Comida.weightFormated(churrasco.getFoodWeight()));
        System.out.println(Comida.weightFormated(pudim.getFoodWeight()));

        System.out.println("---------------PEOPLE---------------");
        System.out.println(Pessoa.weightFormated(aly.getName(), aly.getWeight()));
        System.out.println(Pessoa.weightFormated(leiloca.getName(), leiloca.getWeight()));

        System.out.println("---------------WEIGHT---------------");
        aly.comer(churrasco);
        leiloca.comer(pudim);
    }
}
