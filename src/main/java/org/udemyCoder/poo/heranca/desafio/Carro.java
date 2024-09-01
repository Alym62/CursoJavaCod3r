package org.udemyCoder.poo.heranca.desafio;

public class Carro {
    private final int VELOCIDADE_MAXIMA;
    private int velocidade = 40;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidade > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
            System.out.println("Você está na velocidade máxima => " + velocidade);
        } else {
            var resultado = velocidade += 5;
            System.out.println("Acelerando... Sua valocidade atual => " + resultado);
        }
    }

    void freiar() {
        if (velocidade <= 0) {
            System.out.println("Ops! Você já está parado.");
            return;
        }

        var resultado = velocidade -= 5;

        System.out.println("Freiando... Sua valocidade atual => " + resultado);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
