package org.udemyCoder.excecao.personalizada;

public class NumeroForaIntervaloException extends RuntimeException {
    private final String nomeAtributo;

    public NumeroForaIntervaloException(final String nomeAtributo) {
        super();
        this.nomeAtributo = nomeAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo.", this.nomeAtributo);
    }
}
