package org.udemyCoder.poo.heranca;

public class Heroi extends Jogador {
    public Heroi(int x, int y) {
        super(x, y);
    }

    @Override
    boolean atacar(Jogador player) {
        boolean ataqueOne = super.atacar(player);
        boolean ataqueTwo = super.atacar(player);
        boolean ataqueThree = super.atacar(player);

        return ataqueOne || ataqueTwo || ataqueThree;
    }
}
