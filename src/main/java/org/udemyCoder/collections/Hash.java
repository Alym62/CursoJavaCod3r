package org.udemyCoder.collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Aly"));
        usuarios.add(new Usuario("Thai"));
        usuarios.add(new Usuario("Leiloca"));

        boolean resultado = usuarios.contains(new Usuario("Aly"));
        if (resultado)
            System.out.println(resultado);
    }
}
