package org.udemyCoder.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<>();

        books.add("O Pequeno Príncipe");
        books.push("Don Quixote");
        books.push("O Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.pop()); // TODO: Lança exception
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());

        if (!books.isEmpty())
            books.clear();

        System.out.println(books);
    }
}
