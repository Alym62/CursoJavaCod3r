package org.udemyCoder.campo_minado.visao;

import org.udemyCoder.campo_minado.excecao.ExplosaoException;
import org.udemyCoder.campo_minado.excecao.FimDeJogoException;
import org.udemyCoder.campo_minado.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroView {
    private final Tabuleiro tabuleiro;
    private final Scanner entrada;

    public TabuleiroView(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.entrada = new Scanner(System.in);
    }

    public void executarJogo() {
        try {
            boolean contunar = true;
            while (contunar) {
                this.jogo();

                System.out.println("Outra partida? (S/n)");
                final String respostaOutraPartida = entrada.nextLine();

                if ("n".equalsIgnoreCase(respostaOutraPartida)) {
                    contunar = false;
                } else {
                    this.tabuleiro.reiniciar();
                }
            }
        } catch (FimDeJogoException exception) {
            System.out.println("Volte sempre :)");
        } finally {
            entrada.close();
        }
    }

    private void jogo() {
        try {
            while (!this.tabuleiro.win()) {
                System.out.println(this.tabuleiro);

                String valorDigitado = this.capturarValorDigitado("Digite o número (linha, coluna): ");
                final Iterator<Integer> linhasEColunas = Arrays.stream(valorDigitado.split(","))
                        .map(linhaEColuna -> Integer.parseInt(linhaEColuna.trim())).iterator();

                valorDigitado = this.capturarValorDigitado("1 - Abrir\n2 - Marcar\n");
                if ("1".equals(valorDigitado)) {
                    this.tabuleiro.abrirCampo(linhasEColunas.next(), linhasEColunas.next());
                }
                if ("2".equals(valorDigitado)) {
                    this.tabuleiro.marcarCampo(linhasEColunas.next(), linhasEColunas.next());
                }
            }

            System.out.println(this.tabuleiro);
            System.out.println("Você ganhou!");
        } catch (ExplosaoException exception) {
            System.out.println(this.tabuleiro);
            System.out.println(exception.getMessage());
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.print(texto);
        final String valor = this.entrada.nextLine();
        if ("sair".equalsIgnoreCase(valor)) {
            throw new FimDeJogoException();
        }

        return valor;
    }
}
