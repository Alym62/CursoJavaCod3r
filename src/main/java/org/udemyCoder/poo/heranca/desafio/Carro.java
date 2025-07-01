package org.udemyCoder.poo.heranca.desafio;

public class Carro {
    private final int VELOCIDADE_MAXIMA;
    private int velocidade = 0;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    protected void acelerar() {
        if (velocidade >= VELOCIDADE_MAXIMA) {
            System.out.println("Você está na velocidade máxima => " + velocidade);
        } else {
            var resultado = velocidade += 5;
            System.out.println("Acelerando... Sua valocidade atual => " + resultado);
        }
    }

    protected void freiar() {
        if (velocidade <= 0) {
            System.out.println("Ops! Você já está parado.");
            return;
        }

        var resultado = velocidade -= 5;

        System.out.println("Freiando... Sua valocidade atual => " + resultado);
    }

    protected int getVelocidade() {
        return velocidade;
    }

    protected int getVelocidadeMaxima() {
        return VELOCIDADE_MAXIMA;
    }

    public void setVelocidade(int velocidade) {
        if (this.velocidade == getVelocidadeMaxima()) {
            throw new VelocidadeException("Velocidade máxima atingida");
        }

        this.velocidade = velocidade;
    }
}
