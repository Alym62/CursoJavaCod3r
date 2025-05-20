package org.udemyCoder.streams;

import java.util.Objects;

public class Aluno {
    private final String nome;
    private final double nota;
    private final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = true;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public boolean isBomComportamento() {
        return bomComportamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", bomComportamento=" + bomComportamento +
                '}';
    }
}
