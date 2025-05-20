package org.udemyCoder.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MediaReduce {
    public static void main(String[] args) {
        Aluno carlos = new Aluno("Carlos", 7.1);
        Aluno renata = new Aluno("Renata", 6.1);
        Aluno victor = new Aluno("Victor", 8.1);
        Aluno daniel = new Aluno("Daniel", 10);

        List<Aluno> alunos = new ArrayList<>(List.of(carlos, renata, victor, daniel));

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
        Function<Aluno, Double> apenasNota = Aluno::getNota;

        BiFunction<Media, Double, Media> calcularMedia = Media::add;

        BinaryOperator<Media> combinador = Media::combinar;

        Media resultadoMedia = alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinador);

        System.out.println("Média dos aprovados da turma: " + resultadoMedia.getValor());
    }
}
