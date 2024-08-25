package org.udemyCoder.poo.heranca.desafio;

public class Ferrari extends Carro{
    @Override
    void acelerar() {
        setValocidade(getValocidade() + 15);
        System.out.println("Acelerando a ferrari... Valocidade atual => " + getValocidade());
    }
}
