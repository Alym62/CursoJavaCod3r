package org.udemyCoder.excecao.personalizada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionPersonalizadaChecadaTest {
    public static void main(String[] args) {
        try {
            LeitorArquivo.lerArquivo("test.txt");
        } catch (LeituraDeArquivoException exception) {
            System.out.println(exception.getMessage());
        }
    }

    class LeitorArquivo {
        private LeitorArquivo() {}

        public static void lerArquivo(final String path) throws LeituraDeArquivoException {
            try (final BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String linha = null;

                while ((linha = reader.readLine()) != null) {
                    System.out.println(linha);
                }
            } catch (IOException exception) {
                throw new LeituraDeArquivoException(path);
            }
        }
    }
}
