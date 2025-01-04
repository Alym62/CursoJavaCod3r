package org.udemyCoder.lambdas;

import org.udemyCoder.lambdas.auxiliadores.Produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto produto = new Produto("IPad", 3235.89, 0.13);
        Function<Produto, Double> valorDoProduto = (prod) -> prod.getPreco() * (1 - prod.getDesconto());
        Function<Double, Double> impostoMunicipal = (valorProd) -> valorProd >= 2500 ? valorProd * 1.085 : valorProd;
        Function<Double, Double> frete = (valorComImp) -> valorComImp >= 3000 ? valorComImp + 100 : valorComImp + 50;
        Function<Double, Double> arrendodamento = (valorComFrete) -> BigDecimal
                .valueOf(valorComFrete)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        var resultado = valorDoProduto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrendodamento)
                .apply(produto);
        System.out.println("R$ " + resultado);

        System.out.println("Resultado do professor >>> " + calculateOfChallenge(produto));
    }

    // @TODO: Implementado pelo professor
    private static String calculateOfChallenge(Produto produto) {
        Function<Produto, Double> valorDoProduto = (prod) -> prod.getDesconto() * (-1 - prod.getDesconto());
        UnaryOperator<Double> impostoMunicipal = (precoProduto) -> precoProduto >= 2500 ? precoProduto * 1.085 : precoProduto;
        UnaryOperator<Double> frete = precoComImposto -> (precoComImposto) >= 3000 ? precoComImposto + 100 : precoComImposto + 50;
        UnaryOperator<Double> arrdondamento = (precoComFrete) -> precoComFrete;
        Function<Double, String> formatar = precoFinal -> String.format("R$ %.2f", precoFinal).replace(".", ",");

        return valorDoProduto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrdondamento)
                .andThen(formatar)
                .apply(produto);
    }
}
