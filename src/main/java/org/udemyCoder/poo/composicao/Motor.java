package org.udemyCoder.poo.composicao;

public class Motor {
    private Carro carro;
    private double fatorInjecao = 1;
    private boolean ligado = false;

    public Motor(Carro carro) {
        this.carro = carro;
    }

    public double giros() {
        if (!ligado)
            return 0;
        else
            return Math.round(fatorInjecao * 3000);
    }

    public double getFatorInjecao() {
        return fatorInjecao;
    }

    public void setFatorInjecao(double fatorInjecao) {
        this.fatorInjecao = fatorInjecao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
