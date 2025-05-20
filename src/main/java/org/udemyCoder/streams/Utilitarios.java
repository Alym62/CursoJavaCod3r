package org.udemyCoder.streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
    private Utilitarios() {}

    public final static UnaryOperator<String> maiuscula = String::toUpperCase;
    public final static UnaryOperator<String> primeiraLetra = (n) -> n.charAt(0) + "";
    public final static UnaryOperator<String> grito = (n) -> n + "!!!";
}
