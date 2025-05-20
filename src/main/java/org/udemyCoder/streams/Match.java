package org.udemyCoder.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno carlos = new Aluno("Carlos", 7.1);
        Aluno renata = new Aluno("Renata", 6.1);
        Aluno victor = new Aluno("Victor", 8.1);
        Aluno daniel = new Aluno("Daniel", 10);

        List<Aluno> alunos = new ArrayList<>(List.of(carlos, renata, victor, daniel));

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado.negate()));
    }
}
