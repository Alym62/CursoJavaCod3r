package org.udemyCoder.poo.heranca.desafio;

public class Ferrari extends Carro{
    @Override
    void acelerar() {
        setVelocidade(getVelocidade() + 15);
        System.out.println("Acelerando a ferrari... Valocidade atual => " + getVelocidade());
    }
}
