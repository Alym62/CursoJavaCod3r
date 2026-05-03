package org.udemyCoder.campo_minado.excecao;

public class ExplosaoException extends RuntimeException {
    public ExplosaoException() {
        super("Você perdeu! Fim de jogo!");
    }
}
