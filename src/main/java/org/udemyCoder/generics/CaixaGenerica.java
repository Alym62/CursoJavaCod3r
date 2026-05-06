package org.udemyCoder.generics;

public class CaixaGenerica<T> {
    private T coisa;

    public T abrir() {
        return this.coisa;
    }

    public void guardar(T coisa) {
        this.coisa = coisa;
    }
}
