package org.udemyCoder.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Alyasaf");
        usuarios.put(2, "Leiloca");

        System.out.println(usuarios);
        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        if (usuarios.containsKey(1))
            usuarios.remove(1);

        if (usuarios.containsValue("Leiloca"))
            usuarios.remove(2);

        System.out.println(usuarios);
    }
}
