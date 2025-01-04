package org.udemyCoder.lambdas;

import org.udemyCoder.lambdas.auxiliadores.Calculo;
import org.udemyCoder.lambdas.auxiliadores.Multiplicar;
import org.udemyCoder.lambdas.auxiliadores.Somar;

import java.util.function.BinaryOperator;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(1, 2));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(5, 5));

        // @TODO: Função anônima
        Calculo soma = (x, y) -> {
            if (x < 0 || y < 0) {
                System.out.println("Ops! Tente novamente mais tarde.");
                return 0;
            }

            return x + y;
        };
        System.out.println(soma.executar(-1, -2));

        soma = (x, y) -> x * y;
        System.out.println(soma.executar(5, 5));

        // @TODO: Método default
        System.out.println(soma.info());

        // @TODO: Método estático
        System.out.println(Calculo.infoData());

        // @TODO: Interfaces funcionais definidas pelo Java
        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(10.0, 10.0));

        BinaryOperator<Integer> multi = (x, y) -> x * y;
        System.out.println(multi.apply(10, 10));
    }
}
