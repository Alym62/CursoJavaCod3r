package org.udemyCoder.poo.encapsulamento;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(22);
        pessoa.setNome("Aly");

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
