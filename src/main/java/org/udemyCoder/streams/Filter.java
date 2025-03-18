package org.udemyCoder.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno aly = new Aluno("Aly", 9.5);
        Aluno thai = new Aluno("Thai", 10.0);
        Aluno leiloca = new Aluno("Leila", 10.0);
        Aluno joao = new Aluno("João", 4.1);

        List<Aluno> listaDeAluno = List.of(aly, thai, leiloca, joao);

        Predicate<Aluno> aprovados = aluno -> aluno.getNota() >= 7;
        Function<Aluno, String> saudacao = aluno -> "Parabéns! " + aluno.getNome() + " você foi aprovado(a)! 🥳";

        listaDeAluno.stream()
                .filter(aprovados)
                .map(saudacao)
                .forEach(System.out::println);
    }
}
