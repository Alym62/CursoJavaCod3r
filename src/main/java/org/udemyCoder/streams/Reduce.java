package org.udemyCoder.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
            }
        };

        // Com interface funcional
        BinaryOperator<Integer> soma = (acc, n) -> acc + n;
        Integer total = nums.stream().reduce(soma).get();

        System.out.println(total);

        // Streams com Optional
        nums.stream()
                .filter(n -> n > 5)
                .reduce((acc, n) -> acc + n)
                .ifPresent(System.out::println);

        // Com parallelStream
        Integer totalNums = nums.parallelStream().reduce(0, soma);
        System.out.println(totalNums);
    }
}
