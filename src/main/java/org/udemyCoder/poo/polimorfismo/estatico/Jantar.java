package org.udemyCoder.poo.polimorfismo.estatico;

public class Jantar {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(80);

        Arroz arroz = new Arroz();
        arroz.setPeso(0.120);

        Feijao feijao = new Feijao();
        feijao.setPeso(0.90);

        Sorvete sorvete = new Sorvete();
        sorvete.setPeso(0.200);

        pessoa.comer(arroz);
        pessoa.comer(feijao);
        pessoa.comer(sorvete);

        System.out.println(pessoa.getPeso());

        pessoa.comerTodosAlimentos(arroz, feijao, sorvete);
        System.out.println(pessoa.getPeso());
    }
}
