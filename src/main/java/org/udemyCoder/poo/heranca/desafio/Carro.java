package org.udemyCoder.poo.heranca.desafio;

public class Carro {
    private int valocidade = 40;

    void acelerar() {
        var resultado = valocidade += 5;
        System.out.println("Acelerando... Sua valocidade atual => " + resultado);
    }

    void freiar() {
        if (valocidade <= 0) {
            System.out.println("Ops! Você já está parado.");
            return;
        }

        var resultado = valocidade -= 5;

        System.out.println("Freiando... Sua valocidade atual => " + resultado);
    }

    public int getValocidade() {
        return valocidade;
    }

    public void setValocidade(int valocidade) {
        this.valocidade = valocidade;
    }
}
