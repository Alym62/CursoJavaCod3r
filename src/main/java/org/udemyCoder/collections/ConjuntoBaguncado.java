package org.udemyCoder.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // TODO: double -> Double
        conjunto.add(true);
        conjunto.add("Eu");
        conjunto.add(1);
        conjunto.add('x');

        conjunto.remove('x');

        System.out.println(conjunto.size());

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        conjunto.addAll(nums); // TODO: União entre dois conjuntos.
        System.out.println(conjunto);

        conjunto.retainAll(nums); // TODO: Deixa só o conjunto que está retido.
        System.out.println(conjunto);

        conjunto.clear(); // TODO: Limpa a coleção.
        System.out.println(conjunto);
    }
}
