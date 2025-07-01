package org.udemyCoder.poo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;

    // Getter
    public int getIdade() {
        return this.idade;
    }

    // Setter
    public void setIdade(int idade) {
        if (idade <= 0)
            throw new IllegalArgumentException("Ops! Não é possível realizar essa operação com o valor de: " + idade + "! A idade deve ser > que 0!");

        this.idade = idade;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        if (nome == null || nome.isBlank() || nome.length() < 3)
            throw new IllegalArgumentException("Ops! É preciso passar um nome com no mínimo 3 letras e não pode ser um valor nulo.");

        this.nome = nome.trim();
    }
}
