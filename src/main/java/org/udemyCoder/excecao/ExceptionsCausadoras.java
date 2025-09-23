package org.udemyCoder.excecao;

import org.udemyCoder.streams.Aluno;

public class ExceptionsCausadoras {
    public static void main(String[] args) {
        validarAlunoENome(null);
    }

    private static void validarAlunoENome(final Aluno aluno) {
        try {
            validaAluno(aluno);
            if (aluno.getNome() != null) System.out.println("Nome do aluno: " + aluno.getNome());
        } catch (Exception exception) {
            throw new IllegalArgumentException(exception);
        }
    }

    private static void validaAluno(final Aluno aluno) {
        if (aluno == null) throw new RuntimeException("Ops! Aluno null");

        System.out.println("Aluno validado com sucesso!");
    }
}
