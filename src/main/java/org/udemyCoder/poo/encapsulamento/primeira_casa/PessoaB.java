package org.udemyCoder.poo.encapsulamento.primeira_casa;

public class PessoaB {
    private final PessoaA pessoaA = new PessoaA();

    void acessos() {
        System.out.println(pessoaA.facoDentroDeCasa);
        System.out.println(pessoaA.formaDeFalar);
        System.out.println(pessoaA.todosSabem);
    }
}
