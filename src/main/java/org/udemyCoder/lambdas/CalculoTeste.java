package org.udemyCoder.lambdas;

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
        System.out.println(soma.info());
        System.out.println(Calculo.infoData());
    }
}
