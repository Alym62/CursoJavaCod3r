package org.udemyCoder.poo.heranca;

public class Jogador {
    private int vida = 100;
    private int x;
    private int y;

    public Jogador() {
        this(0, 0);
    }

    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador player) {
        int deltaX = Math.abs(x - player.getX());
        int deltaY = Math.abs(y - player.getY());

        if (deltaX == 0 && deltaY == 1) {
            player.setVida(player.getVida() - 10);
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            player.setVida(player.getVida() - 10);
            return true;
        } else {
            return false;
        }
    }

    void andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> y--;
            case LESTE -> x++;
            case SUL -> y++;
            case OESTE -> x--;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
