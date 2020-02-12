package it.itis.cuneo;

public class CalcoloParallelo {
    public static void main(String[] args) {

        Dati dati = new Dati(3,5);

        Thread thx = new ThreadX(dati);
        Thread tht = new ThreadT(dati);
        Thread thy = new ThreadY(dati);

        thx.start();
        tht.start();

        try {
            thx.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            tht.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thy.start();

        try {
            thy.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Il risultato è " + dati.y);
    }
}
