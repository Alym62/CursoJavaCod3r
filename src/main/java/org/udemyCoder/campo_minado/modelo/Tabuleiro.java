package org.udemyCoder.campo_minado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private int minas;

    private final List<Campo> campos;

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        this.campos = new ArrayList<>();

        // Inicialiar o tabuleiro
        this.gerarCampos();
        this.associarVizinhos();
        this.sortearCamposMinados();
    }

    public boolean win() {
        return this.campos.stream().allMatch(Campo::objetivoAlcancado);
    }

    public void reiniciar() {
        this.campos.forEach(Campo::reiniciar);
        this.sortearCamposMinados();
    }

    public void abrirCampo(int linha, int coluna) {
        this.campos.stream().filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
                .findFirst()
                .ifPresent(Campo::abrir);
    }

    public void marcarCampo(int linha, int coluna) {
        this.campos.stream().filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
                .findFirst()
                .ifPresent(Campo::alternarMarcacao);
    }

    private void sortearCamposMinados() {
        long totalDeMinas = 0L;
        while (totalDeMinas < this.minas) {
            totalDeMinas = this.campos.stream().filter(Campo::isMinado).count();
            final int aleatorio = (int) (Math.random() * campos.size());
            this.campos.get(aleatorio).setMinado(true);
        }
    }

    private void gerarCampos() {
        for (int linha = 0; linha < this.linhas; linha++) {
            for (int coluna = 0; coluna < this.colunas; coluna++) {
                this.campos.add(new Campo(linha, coluna));
            }
        }
    }

    private void associarVizinhos() {
        for (Campo campo : this.campos) {
            for (Campo vizinho : this.campos) {
                campo.adicionarVizinho(vizinho);
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int linha = 0; linha < this.linhas; linha++) {
            for (int coluna = 0; coluna < this.colunas; coluna++) {
                sb.append(" ");
                sb.append(this.campos.get(index));
                sb.append(" ");
                index++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
