package org.udemyCoder.poo.composicao;

public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor(this);
    }

    public void acelerar() {
        double fatorAtual = motor.getFatorInjecao();
        fatorAtual += 0.4;
        motor.setFatorInjecao(fatorAtual);
    }

    public void frear() {
        double fatorAtual = motor.getFatorInjecao();
        fatorAtual -= 0.4;
        motor.setFatorInjecao(fatorAtual);

        if (motor.getFatorInjecao() < 0.0) {
            motor.setLigado(false);
            System.out.println("O carro foi desligado automaticamente!");
        }
    }

    public void ligar() {
        motor.setLigado(true);
    }

    public void desligar() {
        motor.setLigado(false);
    }

    public boolean ligadoIsTrueOrFalse() {
        return motor.isLigado();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
