package org.udemyCoder.excecao;

public class Checada {
    public static void main(String[] args) {
        try {
            gerarErrorException();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            gerarErrorRuntime();
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    /**
     * @author Alyasaf
     * Exception não checada ou não verificada
     */
    private static void gerarErrorRuntime() {
        throw new RuntimeException("Ops! Ocorreu um erro #01");
    }

    /**
     * @author Alyasaf
     * Exception checada ou verificada
     */
    private static void gerarErrorException() throws Exception {
        throw new Exception("Ops! Ocorreu um erro #02");
    }

    class ValidacaoControleDTO {}
}
