package org.udemyCoder.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        strings.add("Aly");
        strings.offer("Bia");

        System.out.println(strings.peek());
        System.out.println(strings.peek());
        System.out.println(strings.element());
        System.out.println(strings.element());
        System.out.println(strings.poll());
        System.out.println(strings.poll());
        System.out.println(strings.poll()); // TODO: Retorna true. Obtém o proximo elemento da fila e remove.
        System.out.println(strings.remove()); // TODO: Lança uma exception.

        if (!strings.isEmpty())
            strings.clear();

        System.out.println(strings);
    }
}
