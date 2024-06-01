package org.udemyCoder.collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Alyasaf"));
        usuarios.add(new Usuario("Leiloca"));

        System.out.println("O nome do primeiro usuário é: " + usuarios.get(0).getNome());

        var condition = usuarios.remove(new Usuario("Leiloca"));
        if (condition)
            System.out.println("Usuário removido com sucesso.");

        if (usuarios.contains(new Usuario("Alyasaf")))
            System.out.println(String.format("O usuário %s está na lista.", usuarios.get(0).getNome()));

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
