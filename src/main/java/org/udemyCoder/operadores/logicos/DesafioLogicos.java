package org.udemyCoder.operadores.logicos;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;
        boolean tomarSorvete  = trabalhoTerca || trabalhoQuinta;

        if (trabalhoTerca && trabalhoQuinta) {
            System.out.println("Vamos comprar uma TV de 50.");
            System.out.println("Vamos tomar sorvete. " + tomarSorvete);
        } else if (trabalhoTerca ^ trabalhoQuinta) {
            System.out.println("Vamos comprar uma TV de 32.");
            System.out.println("Vamos tomar sorvete. " + tomarSorvete);
        } else if (!trabalhoTerca && !trabalhoQuinta) {
            System.out.println("Não vamos comprar TV.");
            System.out.println("Não vamos tomar sorvete. " + !tomarSorvete);
        }
    }
}
