package org.udemyCoder.classe_metodos.desafio;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class DataTeste {
    public static void main(String[] args) {
        Data data;
        data = new Data();
        data.setDia(DayOfWeek.FRIDAY);
        data.setMes(Month.FEBRUARY);
        data.setAno(Year.now());

        Data dataInt = new Data();
        dataInt.setDiaInt(25);
        dataInt.setMesInt(12);
        dataInt.setAnoInt(2024);

        System.out.println(data);
        dataInt.imprimir();
    }
}
