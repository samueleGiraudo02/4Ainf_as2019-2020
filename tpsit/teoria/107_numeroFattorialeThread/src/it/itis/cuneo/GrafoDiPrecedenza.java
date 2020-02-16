package it.itis.cuneo;

public class GrafoDiPrecedenza {
    public static void main(String[] args) {
        Buffer bufferC1 = new Buffer();

        bufferC1.setA(10);

        Thread1 th1 = new Thread1(bufferC1);

        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
