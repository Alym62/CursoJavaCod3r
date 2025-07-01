package org.udemyCoder.poo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {
    private boolean turboLigado;

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        this.turboLigado = false;
    }

    @Override
    protected void acelerar() {
        setVelocidade(getVelocidade() + 15);
        System.out.println("Acelerando a ferrari... Valocidade atual => " + getVelocidade());
    }

    @Override
    public void ligarTurbo() {
        int velocidade = getVelocidade();
        if (velocidade == getVelocidadeMaxima()) {
            this.desligarTurbo();
        }

        this.turboLigado = true;
        setVelocidade(velocidade + 35);
    }

    @Override
    public void desligarTurbo() {
        if (this.turboLigado) {
            System.out.println("Desligando o turbo...");

            int velocidade = getVelocidade();
            this.turboLigado = false;
            setVelocidade(velocidade - 35);
        }

        throw new TurboException("O turbo já está desligado!");
    }
}
