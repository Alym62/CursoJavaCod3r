package org.udemyCoder.conversao;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

public class ConverterStringToNum {
    public static void main(String[] args) {
        String valor = showInputDialog("Digite o primeiro número: ");
        String segundoValor = showInputDialog("Digite o segundo número: ");

        double valorDouble = parseDouble(valor);
        double segundoValorDouble = parseDouble(segundoValor);
        double resultado = valorDouble + segundoValorDouble;

        System.out.println(resultado);
    }
}
