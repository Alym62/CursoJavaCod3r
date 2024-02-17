package org.udemyCoder.notacao_ponto;

public class NotacaoPonto {
    public static void main(String[] args) {
        // TODO: Tipos primitivos não tem o operador ponto.
        String s = "Bom dia papai! 😭";
        if (!s.isBlank())
            System.out.println(s.replace("papai!", "zebu").concat("🍃"));
    }
}
