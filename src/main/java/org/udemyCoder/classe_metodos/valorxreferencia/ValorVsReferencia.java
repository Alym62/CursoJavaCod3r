package org.udemyCoder.classe_metodos.valorxreferencia;

import org.udemyCoder.classe_metodos.desafio.Data;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class ValorVsReferencia {
    public static void main(String[] args) {
        // TODO: Atribuição por valor
        double x = 2;
        double z = x;

        x++;
        z--;

        System.out.println(x + " " + z);

        int y = 1;
        alterarPrimitivo(y);
        System.out.println(y);

        // TODO: Atribuição por referência
        Data dataOne = new Data(DayOfWeek.MONDAY, Month.DECEMBER, Year.now());
        Data dataTwo = dataOne;

        dataOne.setDia(DayOfWeek.FRIDAY);
        dataTwo.setMes(Month.AUGUST);

        System.out.println(dataOne);
        System.out.println(dataTwo);

        dataValorPadrao(dataOne);
        System.out.println(dataOne);
        System.out.println(dataTwo);
    }

    private static void dataValorPadrao(Data data) {
        data.setDia(DayOfWeek.SUNDAY);
        data.setMes(Month.JANUARY);
        data.setAno(Year.now());
    }

    private static void alterarPrimitivo(int index) {
        index++;
    }
}
