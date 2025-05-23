package org.udemyCoder.poo.encapsulamento.segunda_casa;

import org.udemyCoder.poo.encapsulamento.primeira_casa.PessoaA;

public class PessoaD {
    private final PessoaA pessoaA = new PessoaA();

    void acessos() {
        System.out.println(pessoaA.todosSabem);
    }
}
