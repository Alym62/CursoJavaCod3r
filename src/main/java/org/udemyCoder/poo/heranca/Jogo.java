package org.udemyCoder.poo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador playerOne = new Jogador();
        playerOne.setX(10);
        playerOne.setY(20);

        playerOne.andar(Direcao.NORTE);
        playerOne.andar(Direcao.NORTE);
        playerOne.andar(Direcao.LESTE);
        playerOne.andar(Direcao.SUL);

        System.out.println("Valor de x: " + playerOne.getX());
        System.out.println("Valor de y: " + playerOne.getY());
    }
}
