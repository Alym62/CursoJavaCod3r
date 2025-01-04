package org.udemyCoder.classe_metodos.membrosxinstancia;

public class MembrosMain {
    public static void main(String[] args) {
        AreaCirc area = new AreaCirc(5.6);
        System.out.println(area.area());
        System.out.println(AreaCirc.PI);
    }
}
