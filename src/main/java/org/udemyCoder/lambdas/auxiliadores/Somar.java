package org.udemyCoder.lambdas.auxiliadores;

public class Somar implements Calculo{
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
