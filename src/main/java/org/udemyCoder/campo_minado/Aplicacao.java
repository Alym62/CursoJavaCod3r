package org.udemyCoder.campo_minado;

import org.udemyCoder.campo_minado.modelo.Tabuleiro;
import org.udemyCoder.campo_minado.visao.TabuleiroView;

public class Aplicacao {
    public static void main(String[] args) {
        final Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        final TabuleiroView view = new TabuleiroView(tabuleiro);

        view.executarJogo();
    }
}
