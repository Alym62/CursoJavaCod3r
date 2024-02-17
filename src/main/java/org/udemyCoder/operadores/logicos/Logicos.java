package org.udemyCoder.operadores.logicos;

public class Logicos {
    public static void main(String[] args) {
        boolean condicaoVerdadeira = true;
        boolean condicaoVerdadeiraOrFalso = 3 > 7;

        System.out.println(condicaoVerdadeira && condicaoVerdadeiraOrFalso);
        System.out.println(condicaoVerdadeira || condicaoVerdadeiraOrFalso);
        System.out.println(condicaoVerdadeira ^ condicaoVerdadeiraOrFalso);
        System.out.println(!condicaoVerdadeira);
        System.out.println(!condicaoVerdadeiraOrFalso);

        // TODO: Tabela verade AND/&&
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // TODO: Tabela verade OR/||
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // TODO: Tabela verade XOR/^
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // TODO: Tabela verdade NOT/!
        System.out.println(!true);
        System.out.println(!false);
    }
}
