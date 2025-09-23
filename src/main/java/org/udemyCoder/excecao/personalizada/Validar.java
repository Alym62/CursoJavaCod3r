package org.udemyCoder.excecao.personalizada;

import org.udemyCoder.streams.Aluno;

public class Validar {
    private Validar() {}

    public static void validarAluno(final Aluno aluno) {
        if (aluno == null) throw new IllegalArgumentException("O aluno está null!");

        final String nomeAluno = aluno.getNome();
        if (nomeAluno == null || nomeAluno.trim().isEmpty()) throw new StringVaziaException("nome");

        final double nota = aluno.getNota();
        if (nota < 0 || nota > 10) throw new NumeroForaIntervaloException("nota");
    }
}
