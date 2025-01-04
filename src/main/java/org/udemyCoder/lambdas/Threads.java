package org.udemyCoder.lambdas;

public class Threads {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                sleep(100);
            }
        };

        new Thread(task).start();
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException exception) {
            System.out.println("Ocorreu um erro ao tentar colocar a thread para dormir.");
        }
    }
}
