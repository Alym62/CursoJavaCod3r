package org.udemyCoder.campo_minado;

import org.udemyCoder.campo_minado.modelo.Tabuleiro;
import org.udemyCoder.campo_minado.visao.TabuleiroView;

public class Aplicacao {
    public static void main(String[] args) {
        final Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroView(tabuleiro);

        System.out.println(tabuleiro);
    }
}
