package org.udemyCoder.operadores.aritmeticos;

public class DesafioAritmetico {
    public static void main(String[] args) {
        double numSix = 6;
        double numTre = 3;
        double numTwo = 2;
        double numOne = 1;
        double numFive = 5;
        double numSeven = 7;

        var firstSum = Math.pow(numTre + numTwo, 2) * numSix;
        var secondSum = Math.pow(numTwo - numSeven, 2) * (numOne - numFive);
        var thristSum = (firstSum + secondSum);
        var forSum = Math.pow(thristSum / 10, 3);

        System.out.println(firstSum);
        System.out.println(secondSum);
        System.out.println(thristSum);
        System.out.println(forSum);
    }
}
