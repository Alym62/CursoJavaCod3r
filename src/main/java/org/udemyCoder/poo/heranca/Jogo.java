package org.udemyCoder.poo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro playerOne = new Monstro();
        playerOne.setX(10);
        playerOne.setY(10);

        Heroi playerTwo = new Heroi();
        playerTwo.setX(10);
        playerTwo.setY(11);

        System.out.println("Vida jogador 1: " + playerOne.getVida());
        System.out.println("Vida jogador 2: " + playerTwo.getVida());

        System.out.println("===================================>");

        playerOne.atacar(playerTwo);

        System.out.println("Vida jogador 1: " + playerOne.getVida());
        System.out.println("Vida jogador 2: " + playerTwo.getVida());
    }
}
