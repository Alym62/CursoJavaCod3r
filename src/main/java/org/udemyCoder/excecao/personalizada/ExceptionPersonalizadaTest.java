package org.udemyCoder.excecao.personalizada;

import org.udemyCoder.streams.Aluno;

public class ExceptionPersonalizadaTest {
    public static void main(String[] args) {
        final Aluno aluno = new Aluno("Aly", 5.8);

        try {
            Validar.validarAluno(aluno);
        } catch (StringVaziaException | IllegalArgumentException | NumeroForaIntervaloException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Fim!");
        }
    }
}
