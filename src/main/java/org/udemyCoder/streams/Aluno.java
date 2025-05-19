package org.udemyCoder.streams;

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
}
