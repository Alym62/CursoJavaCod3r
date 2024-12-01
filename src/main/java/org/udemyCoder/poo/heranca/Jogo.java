package org.udemyCoder.poo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.setX(10);
        monstro.setY(10);

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro => " + monstro.getVida());
        System.out.println("Heroi => " + heroi.getVida());

        System.out.println("===================================>");

        heroi.atacar(monstro);

        System.out.println("Monstro => " + monstro.getVida());
        System.out.println("Heroi => " + heroi.getVida());
    }
}
