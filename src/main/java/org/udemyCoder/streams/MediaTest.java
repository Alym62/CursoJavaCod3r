package org.udemyCoder.streams;

public class MediaTest {
    public static void main(String[] args) {
        Media media = new Media();
        media.add(8.3);
        media.add(6.7);

        Media mediaNova = new Media().add(7.9).add(6.6);

        System.out.println(media.getValor());

        System.out.println(Media.combinar(media, mediaNova).getValor());
    }
}
