package org.udemyCoder.poo.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final String nome;
    private final List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.getAlunos().add(this);
    }

    public Curso obterCursoPorNome(String nome) {
        return cursos.stream().filter(curso -> curso.getNome().equals(nome)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
