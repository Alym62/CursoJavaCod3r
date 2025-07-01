package org.udemyCoder.poo.abstrata;

public abstract class Mamifero extends Animal {
    @Override
    public final double mover() {
        return 2;
    }

    public abstract String emitirSom();
}
