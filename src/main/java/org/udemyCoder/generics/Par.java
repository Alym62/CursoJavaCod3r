package org.udemyCoder.generics;

import java.util.Objects;

public class Par<K extends Number, V> {
    private K chave;
    private V valor;

    public Par() {
    }

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(chave, par.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chave);
    }

    @Override
    public String toString() {
        return "Par{" +
                "chave=" + chave +
                ", valor=" + valor +
                '}';
    }
}
