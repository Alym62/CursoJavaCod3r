package org.udemyCoder.poo.heranca.desafio;

public class DesafioCarro {
    public static void main(String[] args) {
        Civic civic = new Civic(20);
        Ferrari ferrari = new Ferrari(65);

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.ligarTurbo();
        ferrari.ligarTurbo();
        System.out.println("Velocidade da ferrari ==> " + ferrari.getVelocidade());

        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
        civic.freiar();
    }
}
