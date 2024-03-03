package org.udemyCoder.classe_metodos.desafio;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class Data {
    private DayOfWeek dia;
    private Month mes;
    private Year ano;

    private Integer diaInt;
    private Integer mesInt;
    private Integer anoInt;

    public Data() {}

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        this.mes = mes;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(Year ano) {
        this.ano = ano;
    }

    public Integer getDiaInt() {
        return diaInt;
    }

    public void setDiaInt(Integer diaInt) {
        this.diaInt = diaInt;
    }

    public Integer getMesInt() {
        return mesInt;
    }

    public void setMesInt(Integer mesInt) {
        this.mesInt = mesInt;
    }

    public Integer getAnoInt() {
        return anoInt;
    }

    public void setAnoInt(Integer anoInt) {
        this.anoInt = anoInt;
    }

    public String imprimirDataFormatada() {
        return String.format("%s/%s/%s", diaInt, mesInt, anoInt);
    }

    public void imprimir() {
        System.out.println(imprimirDataFormatada());
    }

    @Override
    public String toString() {
        return String.format("Data[Dia: %s, Mês: %s, Ano: %s]", dia, mes, ano);
    }
}
