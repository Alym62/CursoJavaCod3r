package org.udemyCoder.campo_minado.modelo;

import org.udemyCoder.campo_minado.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int linha;
    private final int coluna;
    private final List<Campo> vizinhos;
    private boolean minado;
    private boolean aberto;
    private boolean marcado;

    protected Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.vizinhos = new ArrayList<>();
        this.minado = false;
        this.aberto = false;
        this.marcado = false;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public List<Campo> getVizinhos() {
        return vizinhos;
    }

    public boolean isMinado() {
        return minado;
    }

    public void setMinado(boolean minado) {
        this.minado = minado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    protected boolean adicionarVizinho(final Campo vizinho) {
        final boolean linhaDiferente = this.linha != vizinho.linha;
        final boolean colunaDiferente = this.coluna != vizinho.coluna;
        final boolean diagonal = linhaDiferente && colunaDiferente;

        final int deltaLinha = Math.abs(this.linha - vizinho.linha);
        final int deltaColuna = Math.abs(this.coluna - vizinho.coluna);
        final int deltaGeral = deltaLinha + deltaColuna;

        if ((deltaGeral == 1 && !diagonal) || (deltaGeral == 2 && diagonal)) {
            this.vizinhos.add(vizinho);
            return true;
        }

        return false;
    }

    protected void alternarMarcacao() {
        if (!this.aberto) {
            this.marcado = !this.marcado;
        }
    }

    protected boolean abrir() {
        if (!this.aberto && !this.marcado) {
            this.aberto = true;
            if (this.minado) {
                throw new ExplosaoException();
            }
            if (this.vizinhancaSegura()) {
                this.vizinhos.forEach(Campo::abrir);
            }

            return true;
        }

        return false;
    }

    protected boolean vizinhancaSegura() {
        return this.vizinhos.stream().noneMatch(Campo::isMinado);
    }

    protected boolean objetivoAlcancado() {
        final boolean desvendado = !this.minado && this.aberto;
        final boolean campoProtegido = this.minado && this.marcado;

        return desvendado || campoProtegido;
    }

    protected Long minasNaVizinhanca() {
        return this.vizinhos.stream().filter(Campo::isMinado).count();
    }

    protected void reiniciar() {
        this.aberto = false;
        this.minado = false;
        this.marcado = false;
    }

    @Override
    public String toString() {
        final Long totalMinasNaVizinhanca = this.minasNaVizinhanca();
        if (!this.marcado) {
            return "x";
        } else if (this.aberto && this.minado) {
            return "💣";
        } else if (this.aberto && totalMinasNaVizinhanca > 0) {
            return totalMinasNaVizinhanca.toString();
        } else if (this.aberto) {
            return " ";
        } else {
            return "?";
        }
    }
}
