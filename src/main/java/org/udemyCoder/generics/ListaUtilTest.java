package org.udemyCoder.generics;

import java.util.ArrayList;
import java.util.List;

public class ListaUtilTest {
    public static void main(String[] args) {
        final List<String> langs = new ArrayList<>(){{
            add("Js");
            add("PHP");
            add("Java");
            add("C++");
        }};
        final List<Integer> nums = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        final String ultimaLinguagem = (String) ListaUtil.getUltimmo(langs);
        System.out.println(ultimaLinguagem);

        final Integer ultimoNumero = (Integer) ListaUtil.getUltimmo(nums);
        System.out.println(ultimoNumero);

        final String ultimaSobrecarga = ListaUtil.getUltimo(langs);
        System.out.println(ultimaSobrecarga);
    }
}
