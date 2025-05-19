package org.udemyCoder.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class AlunoReduce {
    public static void main(String[] args) {
        Aluno carlos = new Aluno("Carlos", 7.1);
        Aluno renata = new Aluno("Renata", 6.1);
        Aluno victor = new Aluno("Victor", 8.1);
        Aluno daniel = new Aluno("Daniel", 10);

        List<Aluno> alunos = new ArrayList<>(List.of(carlos, renata, victor, daniel));

        // Com interfaces funcionais
        // @TODO: Filter
        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
        // @TODO: Map
        Function<Aluno, Double> nota = aluno -> aluno.getNota();
        // @TODO: Reduce
        BinaryOperator<Double> soma = (a, b) -> a + b;

        alunos.parallelStream()
                .filter(aprovado)
                .map(nota)
                .reduce(soma)
                .ifPresent(System.out::println);

        // Com streams
        alunos.stream()
                .filter(aluno -> aluno.getNota() >= 7)
                .map(Aluno::getNota)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
