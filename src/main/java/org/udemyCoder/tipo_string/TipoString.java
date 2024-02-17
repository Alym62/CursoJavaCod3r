package org.udemyCoder.tipo_string;
public class TipoString {
    public static void main(String[] args) {
        String ini = "Eu aqui papai 😭";
        System.out.println(ini.concat("🍃"));

        var nome = "Aly";
        var sobrenome = "Meireles";
        var idade = 20;
        var profissao = "Desenvolvedor";

        StringBuilder sb = new StringBuilder();

        System.out.println(sb.append(
                String.format(
                        "Nome: %s\n" +
                        "Sobrenome: %s\n" +
                        "Idade: %s\n" +
                        "Profissão: %s", nome, sobrenome, idade, profissao)
        ));
    }
}
