package org.udemyCoder.poo.abstrata;

public class AbstrataTest {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        System.out.println(animal.mover());
        System.out.println(animal.respirar());

        Mamifero mamifero = new Cachorro();
        System.out.println(mamifero.mover());
        System.out.println(mamifero.respirar());
        System.out.println(mamifero.emitirSom());
    }
}
