package org.udemyCoder.excecao.personalizada;

public class LeituraDeArquivoException extends Exception {
    private final String path;

    public LeituraDeArquivoException(final String path) {
        super();
        this.path = path;
    }

    @Override
    public String getMessage() {
        return String.format("Ops! Não foi possível ler o arquivo %s", this.path);
    }
}
