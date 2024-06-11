package org.udemyCoder.equals;

import java.util.Date;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Aly", "eu@email.com");
        Usuario usuarioTwo = new Usuario("Aly", "eu@email.com");

        System.out.println(usuario == usuarioTwo);
        System.out.println(usuario.equals(usuarioTwo));
        System.out.println(usuarioTwo.equals(new Date()));
    }
}
