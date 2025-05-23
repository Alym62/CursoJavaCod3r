package org.udemyCoder.poo.encapsulamento.segunda_casa;

import org.udemyCoder.poo.encapsulamento.primeira_casa.PessoaA;

public class PessoaC extends PessoaA {
    void acessos() {
        System.out.println(super.formaDeFalar);
        System.out.println(super.todosSabem);
    }
}
