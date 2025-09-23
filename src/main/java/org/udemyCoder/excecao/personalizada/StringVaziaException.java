package org.udemyCoder.excecao.personalizada;

public class StringVaziaException extends RuntimeException {
    private final String nomeAtributo;

    public StringVaziaException(final String nomeAtributo) {
        super();
        this.nomeAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está vazio.", this.nomeAtributo);
    }
}
