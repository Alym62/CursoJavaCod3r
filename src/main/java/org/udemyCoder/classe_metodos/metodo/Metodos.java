package org.udemyCoder.classe_metodos.metodo;

public class Metodos {
    public static void main(String[] args) {
        System.out.println(somar(20, 20));
        imprimir();
    }

    private static int somar(int x, int y) {
        return x + y;
    }

    private static void imprimir() {
        var condicao = nomesIguais("Aly", "Aly");
        System.out.println(condicao);
    }

    private static boolean nomesIguais(String a, String b) {
        return a.equals(b);
    }
}
