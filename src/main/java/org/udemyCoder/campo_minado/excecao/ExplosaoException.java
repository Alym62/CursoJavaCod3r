package org.udemyCoder.campo_minado.excecao;

public class ExplosaoException extends RuntimeException {
    public ExplosaoException() {
        super("Fim de jogo!");
    }
}
