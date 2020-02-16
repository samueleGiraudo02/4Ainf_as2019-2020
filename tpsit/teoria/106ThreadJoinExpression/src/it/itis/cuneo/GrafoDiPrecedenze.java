package it.itis.cuneo;

public class GrafoDiPrecedenze {
    public static void main(String[] args) {
        Buffer bufferC1 = new Buffer();
        Buffer bufferC2 = new Buffer();

        bufferC1.setA(2);
        bufferC2.setA(2);

        bufferC1.setB(3);
        bufferC2.setB(3);

        Thread1 th1 = new Thread1(bufferC1);
        Thread2 th2 = new Thread2(bufferC1);
        Thread3 th3 = new Thread3(bufferC2);
        Thread4 th4 = new Thread4(bufferC2);
        Thread5 th5 = new Thread5(bufferC1,bufferC2);

        th1.start();
        th3.start();
        try {
            th1.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th2.start();
        th4.start();
        try {
            th2.join();
            th4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th5.start();
        try {
            th5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
