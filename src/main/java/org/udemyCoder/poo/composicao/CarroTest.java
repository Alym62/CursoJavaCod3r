package org.udemyCoder.poo.composicao;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.ligadoIsTrueOrFalse());

        carro.ligar();
        System.out.println(carro.ligadoIsTrueOrFalse());

        System.out.println(carro.getMotor().giros());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.getMotor().giros());

        carro.frear();

        System.out.println(carro.getMotor().giros());
    }
}
