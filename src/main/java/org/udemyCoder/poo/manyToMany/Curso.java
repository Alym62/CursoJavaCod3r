package org.udemyCoder.poo.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private final String nome;
    private final List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.getCursos().add(this);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
