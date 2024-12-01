package org.udemyCoder.lambdas;

import java.time.LocalDate;

@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);

    default String info() {
        return "Curso Java - Coder";
    }

    static LocalDate infoData() {
        return LocalDate.now();
    }
}
