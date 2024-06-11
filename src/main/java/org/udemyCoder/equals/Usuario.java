package org.udemyCoder.equals;

public class Usuario {
    private String nome;
    private String email;

    public Usuario() {}

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario usuario) {
            boolean nomeIgual = usuario.getNome().equals(this.nome);
            boolean emailIgual = usuario.getEmail().equals(this.email);

            return nomeIgual && emailIgual;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
}
