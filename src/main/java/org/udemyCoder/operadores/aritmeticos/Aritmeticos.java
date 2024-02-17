package org.udemyCoder.operadores.aritmeticos;

public class Aritmeticos {
    public static void main(String[] args) {
        double x = 34.56;
        double y = 2.2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);

        // TODO: Módulo, Resto de divisão.
        System.out.println(a % b);

        System.out.println(x + y - a * b);
    }
}
