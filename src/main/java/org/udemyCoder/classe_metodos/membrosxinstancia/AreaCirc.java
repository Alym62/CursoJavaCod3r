package org.udemyCoder.classe_metodos.membrosxinstancia;


public class AreaCirc {
    private double raio;
    static final double PI = 3.14;

    public AreaCirc(double raioInicial) {
        this.raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
