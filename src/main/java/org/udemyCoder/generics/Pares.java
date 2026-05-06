package org.udemyCoder.generics;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pares {
    private final Set<Par<Integer, Boolean>> valores = new LinkedHashSet<>();

    public void adicionarValor(final Integer chave, final Boolean valor) {
        if (chave == null) return;

        this.valores.add(new Par<>(chave, valor));
    }

    public Par<Integer, Boolean> getValor(final Integer chave) {
        if (chave == null) return null;

        return this.valores.stream()
                .filter(valor -> valor.getChave().equals(chave))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Pares{" +
                "valores=" + valores +
                '}';
    }
}
