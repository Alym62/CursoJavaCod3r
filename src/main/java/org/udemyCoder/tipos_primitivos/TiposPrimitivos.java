package org.udemyCoder.tipos_primitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // TODO: Informações do funcionario.
        //  Tipos numéricos inteiros.
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //  TODO: Tipos numéricos reais.
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_103.01;

        //  TODO: Tipo booleano.
        boolean estaDeFerias = true;

        // TODO: Tipo caractere.
        char status = 'A';

        // TODO: Dias de empresa.
        System.out.println(anosDeEmpresa * 365);

        // TODO: Número de viajens.
        System.out.println(numeroDeVoos / 2);

        // TODO: Pontos por real.
        System.out.println(pontosAcumulados / vendasAcumuladas);

        // TODO: Id do usuário.
        System.out.println(id + " [Salario] -> " + salario);
        System.out.println("[Férias]: " + estaDeFerias);
        System.out.println("[Ativo/Desligado]: " + status);
    }
}
