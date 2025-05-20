package org.udemyCoder.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MinMax {
    public static void main(String[] args) {
        Aluno carlos = new Aluno("Carlos", 7.1);
        Aluno renata = new Aluno("Renata", 6.1);
        Aluno victor = new Aluno("Victor", 8.1);
        Aluno daniel = new Aluno("Daniel", 10);

        List<Aluno> alunos = new ArrayList<>(List.of(carlos, renata, victor, daniel));

        Comparator<Aluno> melhorNota = (primeiroAluno, segundoAluno) -> {
            if (primeiroAluno.getNota() > segundoAluno.getNota()) return 1;
            if (primeiroAluno.getNota() < segundoAluno.getNota()) return -1;

            return 0;
        };

        Consumer<Aluno> check = System.out::println;

        alunos.stream().max(melhorNota).ifPresent(check);
        alunos.stream().min(melhorNota).ifPresent(check);
    }
}
