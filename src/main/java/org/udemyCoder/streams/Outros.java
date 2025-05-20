package org.udemyCoder.streams;

import java.util.ArrayList;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno carlos = new Aluno("Carlos", 7.1);
        Aluno renata = new Aluno("Guilherme", 10);
        Aluno victor = new Aluno("Victor", 8.1);
        Aluno daniel = new Aluno("Daniel", 10);
        Aluno guilherme = new Aluno("Guilherme", 10);
        Aluno david = new Aluno("Daniel", 10);

        List<Aluno> alunos = new ArrayList<>(List.of(carlos, renata, victor, daniel, guilherme, david));

        // @TODO: Evita valores duplicados
        System.out.println("Distinct");
        alunos.stream().distinct().forEach(System.out::println);

        // @TODO: Pula e limita os elementos de uma Stream
        System.out.println("Skip/Limit");
        alunos.stream().distinct().skip(2).limit(1).forEach(System.out::println);

        // @TODO: Vai percorrer e pegar elementos que satisfaz a condição
        System.out.println("Take while");
        alunos.stream().distinct().takeWhile(aluno -> aluno.getNota() >= 7).forEach(System.out::println);
    }
}
